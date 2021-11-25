package com.sda.practice.springbootpractice.services.implementations;

import com.sda.practice.springbootpractice.models.Authority;
import com.sda.practice.springbootpractice.repositories.AuthorityRespository;
import com.sda.practice.springbootpractice.services.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityRespository authorityRespository;

    @Override
    public void createAuthority(Authority authority){
    if (!findAuthorityByName(authority.getName()).isPresent()){
        authorityRespository.save(authority);
    }

    }

    @Override
    public Optional<Authority> findAuthorityByName(String name){
        return authorityRespository.findByName(name);
    }

    @Override
    public List<Authority> getAllAuthorities(){
        return authorityRespository.findAll();
    }

}
