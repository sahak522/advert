package com.advert.services.impl;

import com.advert.models.User;
import com.advert.repositories.UserDAO;
import com.advert.services.UserServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sahak_000 on 22.05.2014.
 */
@Service
public class UserServiceManagerImpl implements UserServiceManager {

    @Autowired
    private UserDAO userDAO;


    // API
    public void create(final User entity) {
        userDAO.create(entity);
    }

    public User findOne(final long id) {
        return userDAO.findOne(id);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }
}
