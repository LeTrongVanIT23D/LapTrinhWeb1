package com.example.studentmanager.Controller;

import com.example.studentmanager.Entity.TuitionFee;
import com.example.studentmanager.Service.TuitionFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/tuition-fees")
@CrossOrigin("*")
public class TuitionFeeApiController {

    @Autowired
    private TuitionFeeService service;

    @GetMapping
    public List<TuitionFee> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TuitionFee getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @PostMapping
    public TuitionFee add(@RequestBody TuitionFee tuitionFee) {
        return service.save(tuitionFee);
    }

    @PutMapping("/{id}")
    public TuitionFee update(@PathVariable UUID id, @RequestBody TuitionFee tuitionFee) {
        tuitionFee.setFeeId(id);
        return service.save(tuitionFee);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable UUID id) {
        service.delete(id);
        return "Deleted successfully fee ID: " + id;
    }
}
