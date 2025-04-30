package com.learning.rest_demo.service.impl;

import com.learning.rest_demo.model.Student;
import com.learning.rest_demo.repository.StudentRepository;
import com.learning.rest_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public String createStudent(Student student) {
        // Logic
        studentRepository.save(student);
        return "Student creation success.";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Update student success.";
    }

    @Override
    public String deleteStudent(String studentId) {
        studentRepository.deleteById(studentId);
        return "Delete student success.";
    }

    @Override
    public Student getStudent(String studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
