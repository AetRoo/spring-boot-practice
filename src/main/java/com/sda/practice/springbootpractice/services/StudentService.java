package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Student;
import com.sda.practice.springbootpractice.models.Teacher;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAllStudents();

    List<Student> findAllStudentsByCity(City city);


    void createStudent(Student student);

    /**
     * To find teacher by Id
     * @param id Id of the teacher
     * @return Optional of Teacher
     */
    Optional<Student> findStudentById(Long id);

    void updateStudent(Student student);

    void deleteStudentById(Long id);

    void restoreStudentById(Long id);
}

