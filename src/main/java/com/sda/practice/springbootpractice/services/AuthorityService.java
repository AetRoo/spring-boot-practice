package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.Authority;

import java.util.List;
import java.util.Optional;


public interface AuthorityService {

    void createAuthority(Authority authority);


    Optional<Authority> findAuthorityByName(String name);


    List<Authority> getAllAuthorities();
}

