package com.tescobank.rbac.rest.repository;

import com.tescobank.rbac.rest.entity.User;
import org.springframework.dao.DataAccessException;

public interface UserRepository {

    void save(User user) throws DataAccessException;

    User findById(int id) throws DataAccessException;
}
