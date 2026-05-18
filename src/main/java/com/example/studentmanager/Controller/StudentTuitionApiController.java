package com.example.studentmanager.Controller;

import com.example.studentmanager.Entity.StudentTuition;
import com.example.studentmanager.Service.StudentTuitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/student-tuitions")
public class StudentTuitionApiController {

    @Autowired
    private StudentTuitionService service;

    @GetMapping
    public List<StudentTuition> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentTuition getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @GetMapping("/student/{studentId}")
    public List<StudentTuition> getByStudentId(@PathVariable Integer studentId) {
        return service.getByStudentId(studentId);
    }

    @PostMapping
    public StudentTuition add(@RequestBody StudentTuition studentTuition) {
        return service.save(studentTuition);
    }

    @PutMapping("/{id}")
    public StudentTuition update(@PathVariable UUID id, @RequestBody StudentTuition studentTuition) {
        studentTuition.setTuitionId(id);
        return service.save(studentTuition);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable UUID id) {
        service.delete(id);
        return "Deleted successfully StudentTuition ID: " + id;
    }
}
