package com.example.studentmanager.Controller;

import com.example.studentmanager.Entity.Student;
import com.example.studentmanager.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentApiController {

    @Autowired
    private StudentService studentService;

    // Lấy toàn bộ danh sách từ SQL: localhost:8080/api/students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Lấy 1 sinh viên theo ID từ SQL: localhost:8080/api/student/1
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Xin chào ST23C, buổi học đầu tiên!";
    }
}