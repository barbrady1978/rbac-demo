package com.tescobank.rbac.rest.repository;

import com.tescobank.rbac.rest.entity.User;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) throws DataAccessException {
        if (user.getId() == null) {
            this.em.persist(user);
        } else {
            this.em.merge(user);
        }
    }

    @Override
    public User findById(int id) throws DataAccessException {
        return this.em.find(User.class, id);
    }
}
