package edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @NotBlank(message = "* stundent Number required")
    private String studentNumber;
    @NotBlank(message = "* First Name required")
    private String firstName;

    private String middleName;

    @NotBlank(message = "* Last Name required")
    private String lastName;

    private double cgpa;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate enrollmentdate;
  //  @NotBlank(message = "* requiered field")
    @NotNull
    private boolean isInternational;

    public LocalDate getEnrollmentdate() {
        return enrollmentdate;
    }

    public void setEnrollmentdate(
            LocalDate enrollmentdate) {
        this.enrollmentdate = enrollmentdate;
    }



    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public boolean getIsInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }
}
