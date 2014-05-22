package com.advert.repositories;


import com.advert.models.User;

import java.util.List;

/**
 * Created by sahak_000 on 21.05.2014.
 */
public interface UserDao1 {

    public User findOne(long id);

    public List<User> findAll();

    public void create(User entity);

    public User update(User entity);

    public void delete(User entity);

    public void deleteById(long entityId);
}
