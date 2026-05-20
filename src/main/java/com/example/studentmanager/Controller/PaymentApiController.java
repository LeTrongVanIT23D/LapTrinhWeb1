package com.example.studentmanager.Controller;

import com.example.studentmanager.Entity.Payment;
import com.example.studentmanager.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin("*")
public class PaymentApiController {

    @Autowired
    private PaymentService service;

    @GetMapping
    public List<Payment> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Payment getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @GetMapping("/tuition/{tuitionId}")
    public List<Payment> getByTuitionId(@PathVariable UUID tuitionId) {
        return service.getByTuitionId(tuitionId);
    }

    @PostMapping
    public Payment add(@RequestBody Payment payment) {
        return service.save(payment);
    }

    @PutMapping("/{id}")
    public Payment update(@PathVariable UUID id, @RequestBody Payment payment) {
        payment.setPaymentId(id);
        return service.save(payment);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable UUID id) {
        service.delete(id);
        return "Deleted successfully Payment ID: " + id;
    }
}
