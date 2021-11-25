package com.sda.practice.springbootpractice.services.implementations;


import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Student;
import com.sda.practice.springbootpractice.repositories.StudentRepository;
import com.sda.practice.springbootpractice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return null;
    }

    @Override
    public List<Student> findAllStudentsByCity(City city){
    return studentRepository.findAllByCity(city);
}
@Override
    public void createStudent(Student student){
        student.setActive(true);
        studentRepository.save(student);
}
@Override
    public Optional<Student> findStudentById(Long id){
        return studentRepository.findById(id);
}
@Override
    public void updateStudent(Student student) {
        if ( student == null|| !studentRepository.existsById(student.getId())){
            throw new RuntimeException(("Student not found!"));
        }
        studentRepository.saveAndFlush(student);
}
@Override
    public void deleteStudentById(Long id){
        Optional<Student> studentOptional = findStudentById(id);

        if(!studentOptional.isPresent()){
            throw new RuntimeException("Student not found!");
        }
        else{
            Student student = studentOptional.get();
            student.setActive(false);
            studentRepository.saveAndFlush(student);

        }
    }
    @Override
    public void restoreStudentById(Long id) {
        Optional<Student> studentOptional = findStudentById(id);

        if(!studentOptional.isPresent()){
            throw new RuntimeException("Student not found!");
        }
        else{
            Student student = studentOptional.get();
            student.setActive(true);
            studentRepository.saveAndFlush(student);

        }
    }
}
