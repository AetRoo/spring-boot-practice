package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.Users;

import java.util.List;
import java.util.Optional;


public interface UsersService {

    void createUser(Users users);

    Optional<Users> findUserByUsername(String username);

    Optional<Users> findUserByUsernameAndPassword(String username, String password);

    List<Users> getAllUsers();
}