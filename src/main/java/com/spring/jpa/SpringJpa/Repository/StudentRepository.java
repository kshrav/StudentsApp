package com.spring.jpa.SpringJpa.Repository;

import com.spring.jpa.SpringJpa.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
