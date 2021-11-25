package com.sda.practice.springbootpractice.repositories;

import com.sda.practice.springbootpractice.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AuthorityRespository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(String name);
}