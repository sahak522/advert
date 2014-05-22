package com.advert.repositories.impl;

import com.advert.models.User;
import com.advert.repositories.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by sahak_000 on 21.05.2014.
 */
@Repository("user")
public class UserDaoImpl extends AbstractJpaDao1<User> implements UserDao {

    public UserDaoImpl() {
        super();
        setClazz(User.class);
    }


}
