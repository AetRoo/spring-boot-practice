package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Teacher;

import java.util.List;
import java.util.Optional;


public interface TeacherService {

    List<Teacher> findAllTeachers();

    List<Teacher> findAllTeachersByCity(City city);


    void createTeacher(Teacher teacher);


    Optional<Teacher> findTeacherById(Long id);

    void updateTeacher(Teacher teacher);

    void deleteTeacherById(Long id);

    void restoreTeacherById(Long id);
}