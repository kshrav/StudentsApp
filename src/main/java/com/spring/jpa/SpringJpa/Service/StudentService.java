package com.spring.jpa.SpringJpa.Service;

import com.spring.jpa.SpringJpa.Model.Student;
import com.spring.jpa.SpringJpa.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository repo;


    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student getStudentBYId(int id) {
        return repo.findById(id).orElse(new Student());
    }

    public void addStudent(Student student){
       repo.save(student);
    }

    public void removeStudentById(int id) {
        repo.deleteById(id);
    }
}
