package com.greenapex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenapex.domain.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);

    List<User> findAll();

}
