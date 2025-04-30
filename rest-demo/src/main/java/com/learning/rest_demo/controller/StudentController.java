package com.learning.rest_demo.controller;

import com.learning.rest_demo.model.Student;
import com.learning.rest_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Read specific Student Details by their id from DB
    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable("studentId") String studentId){
        return studentService.getStudent(studentId);
    }

    // Read all Student Details from DB
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    // Add Student Details in DB
    @PostMapping
    public String createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    // Update Student Details in DB
    @PutMapping
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    // Delete Student by id in DB
    @DeleteMapping("{studentId}")
    public String deleteStudent(@PathVariable("studentId") String studentId){
        return studentService.deleteStudent(studentId);
    }
}
