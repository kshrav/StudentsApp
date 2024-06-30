package com.spring.jpa.SpringJpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
public class Student {
    @Id
    private int studentRollNo;
    private String studentName;
    private int studentAge;
    private List<Integer> studentMarks;

    public Student(int studentRollNo, String studentName, int studentAge, List<Integer> studentMarks) {
        super();
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMarks = studentMarks;
    }

    public Student() {
        super();
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public List<Integer> getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(List<Integer> studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRollNo=" + studentRollNo +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentMarks=" + studentMarks +
                '}';
    }
}
