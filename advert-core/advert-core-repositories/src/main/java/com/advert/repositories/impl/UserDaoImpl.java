package com.advert.repositories.impl;

import com.advert.models.User;
import com.advert.repositories.UserDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sahak_000 on 21.05.2014.
 */
@Repository("user")
public class UserDAOImpl extends AbstractJpaDAO<User> implements UserDAO {

    public UserDAOImpl() {
        super();
        setClazz(User.class);
    }


}
