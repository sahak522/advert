package com.advert.services.impl;

import com.advert.models.User;
import com.advert.repositories.UserDao1;
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
    private UserDao1 userDao1;


    // API
    public void create(final User entity) {
        userDao1.create(entity);
    }

    public User findOne(final long id) {
        return userDao1.findOne(id);
    }

    public List<User> findAll() {
        return userDao1.findAll();
    }
}
