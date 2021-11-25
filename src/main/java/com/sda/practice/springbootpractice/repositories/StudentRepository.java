package com.sda.practice.springbootpractice.repositories;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByCity(City city);
}
