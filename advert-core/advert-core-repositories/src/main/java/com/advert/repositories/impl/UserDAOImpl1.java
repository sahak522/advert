package com.advert.repositories.impl;

import com.advert.models.User;
import com.advert.repositories.UserDao1;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sahak_000 on 21.05.2014.
 */
@Repository("user")
public class UserDAOImpl1 extends AbstractJpaDAO<User> implements UserDao1 {

    public UserDAOImpl1() {
        super();
        setClazz(User.class);
    }


}
