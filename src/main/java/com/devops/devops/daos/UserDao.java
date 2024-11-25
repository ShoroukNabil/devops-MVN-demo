package com.devops.devops.daos;

import com.devops.devops.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByEmailAndPassword(@Param("email") String email,@Param("password") String password);
}
