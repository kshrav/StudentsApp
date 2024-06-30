package com.spring.jpa.SpringJpa.Controller;

import com.spring.jpa.SpringJpa.Model.Student;
import com.spring.jpa.SpringJpa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentService service;

    @GetMapping("students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentBYId(id);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student student){
        service.addStudent(student);
        return "Student added";
    }

    @PutMapping("students")
    public Student updateStudent(@RequestBody Student student){
        service.updateStudent(student);
        return service.getStudentBYId(student.getStudentRollNo());
    }

    @DeleteMapping("/student/{id}")
    public String removeStudentById(@PathVariable int id){
        service.removeStudentById(id);
        return "Student got Removed Successfully";
    }
}