package com.sda.practice.springbootpractice.services.implementations;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Teacher;
import com.sda.practice.springbootpractice.repositories.TeacherRepository;
import com.sda.practice.springbootpractice.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public List<Teacher> findAllTeachersByCity(City city) {
        return teacherRepository.findAllByCity(city);
    }

    @Override
    public void createTeacher(Teacher teacher) {
        teacher.setActive(true);
        teacherRepository.save(teacher);
    }

    @Override
    public Optional<Teacher> findTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        if (teacher == null || !teacherRepository.existsById(teacher.getId())) {
            throw new RuntimeException("Teacher not found!");
        }

        teacherRepository.saveAndFlush(teacher);
    }

    @Override
    public void deleteTeacherById(Long id) {
        Optional<Teacher> teacherOptional = findTeacherById(id);

        if (!teacherOptional.isPresent()) {
            throw new RuntimeException("Teacher not found!");
        }
        else {
            Teacher teacher = teacherOptional.get();
            teacher.setActive(false);
            teacherRepository.saveAndFlush(teacher);
        }
    }

    @Override
    public void restoreTeacherById(Long id) {
        Optional<Teacher> teacherOptional = findTeacherById(id);

        if (!teacherOptional.isPresent()) {
            throw new RuntimeException("Teacher not found!");
        }
        else {
            Teacher teacher = teacherOptional.get();
            teacher.setActive(true);
            teacherRepository.saveAndFlush(teacher);
        }
    }
}