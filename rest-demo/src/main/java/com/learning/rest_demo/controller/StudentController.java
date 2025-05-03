package com.learning.rest_demo.controller;

import com.learning.rest_demo.model.Student;
import com.learning.rest_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/login")
    public String loginVerify(@RequestParam String username, @RequestParam String password){
        Student stud = studentService.getStudent(username);

        if((stud.getStudentId()!= null | stud.getStudentPassword() != null) | stud.getStudentId().equals(username) && stud.getStudentPassword().equals(password)){
            return "Login Successfully";
        }

        return" Invalid Username / Password";
    }

    // Read specific Student Details by their id from DB
    @GetMapping("/get/{studentId}")
    public Student getStudent(@PathVariable("studentId") String studentId){
        return studentService.getStudent(studentId);
    }

    // Read all Student Details from DB
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    // Add Student Details in DB
    @PostMapping("/signup")
    public String createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    // Update Student Details in DB
    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    // Delete Student by id in DB
    @DeleteMapping("/delete/{studentId}")
    public String deleteStudent(@PathVariable("studentId") String studentId){
        return studentService.deleteStudent(studentId);
    }

}
