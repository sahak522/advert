package com.advert.repositories.impl;

import com.advert.models.User;
import com.advert.repositories.UserDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sahak_000 on 21.05.2014.
 */
@Repository
public abstract class UserDaoImpl implements UserDao {
    @Override
    public User findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAll(Sort orders) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<User> findAll(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(Iterable<? extends User> users) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public User saveAndFlush(User user) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<User> users) {

    }

    @Override
    public void deleteAllInBatch() {

    }
}
