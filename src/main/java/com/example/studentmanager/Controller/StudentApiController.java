// StudentApiController.java
package com.example.studentmanager.Controller;

import com.example.studentmanager.Entity.Student;
import com.example.studentmanager.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentApiController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi Server: " + e.getMessage());
    }

    @Autowired
    private StudentService service;

    // Yêu cầu 5: Lấy danh sách - Get All
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // Yêu cầu 4: Lấy sinh viên theo ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return service.getById(id);
    }

    // Yêu cầu 3: Tìm kiếm sinh viên theo tên
    @GetMapping("/search")
    public List<Student> search(@RequestParam String keyword) {
        return service.search(keyword);
    }

    // Yêu cầu 1: Thêm mới sinh viên
    @PostMapping
    public Student add(@RequestBody Student student) {
        return service.save(student);
    }

    // Yêu cầu 6: Cập nhật sinh viên
    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        return service.save(student);
    }

    // Yêu cầu 2: Xóa sinh viên
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Xóa thành công sinh viên ID: " + id;
    }
}