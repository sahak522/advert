package com.advert.services.impl;

import com.advert.models.User;
import com.advert.repositories.UserDao;
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
    private UserDao userDao;


    // API
    public void create(final User entity) {
        userDao.create(entity);
    }

    public User findOne(final long id) {
        return userDao.findOne(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
