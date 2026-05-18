package com.example.studentmanager.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "student_tuition")
public class StudentTuition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tuition_id", updatable = false, nullable = false)
    private UUID tuitionId;

    // Based on the 'students' table using 'int id', we map it as Integer
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "semester_id")
    private UUID semesterId;

    @Column(name = "total_credits")
    private int totalCredits;

    @Column(name = "raw_amount", precision = 15, scale = 2)
    private BigDecimal rawAmount;

    @Column(name = "scholarship_deduction", precision = 15, scale = 2)
    private BigDecimal scholarshipDeduction;

    @Column(name = "exemption_amount", precision = 15, scale = 2)
    private BigDecimal exemptionAmount;

    @Column(name = "net_amount", precision = 15, scale = 2)
    private BigDecimal netAmount;

    @Column(name = "paid_amount", precision = 15, scale = 2)
    private BigDecimal paidAmount;

    @Column(name = "debt_amount", precision = 15, scale = 2)
    private BigDecimal debtAmount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TuitionStatus status;

    @Column(name = "deadline")
    private LocalDate deadline;

    public StudentTuition() {
    }

    public UUID getTuitionId() {
        return tuitionId;
    }

    public void setTuitionId(UUID tuitionId) {
        this.tuitionId = tuitionId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public UUID getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(UUID semesterId) {
        this.semesterId = semesterId;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public BigDecimal getRawAmount() {
        return rawAmount;
    }

    public void setRawAmount(BigDecimal rawAmount) {
        this.rawAmount = rawAmount;
    }

    public BigDecimal getScholarshipDeduction() {
        return scholarshipDeduction;
    }

    public void setScholarshipDeduction(BigDecimal scholarshipDeduction) {
        this.scholarshipDeduction = scholarshipDeduction;
    }

    public BigDecimal getExemptionAmount() {
        return exemptionAmount;
    }

    public void setExemptionAmount(BigDecimal exemptionAmount) {
        this.exemptionAmount = exemptionAmount;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public TuitionStatus getStatus() {
        return status;
    }

    public void setStatus(TuitionStatus status) {
        this.status = status;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
