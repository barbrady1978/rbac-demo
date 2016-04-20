package com.tescobank.rbac.rest.service;

import com.tescobank.rbac.rest.entity.User;
import org.springframework.dao.DataAccessException;

public interface UserService {

    void save(User user) throws DataAccessException;

    User findById(int id) throws DataAccessException;
}
