package com.advert.repositories;



import com.advert.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sahak_000 on 21.05.2014.
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
