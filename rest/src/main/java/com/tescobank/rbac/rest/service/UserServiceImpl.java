package com.tescobank.rbac.rest.service;

import com.tescobank.rbac.rest.entity.User;
import com.tescobank.rbac.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void save(User user) throws DataAccessException {
        userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(int id) throws DataAccessException {
        return userRepository.findById(id);
    }
}
