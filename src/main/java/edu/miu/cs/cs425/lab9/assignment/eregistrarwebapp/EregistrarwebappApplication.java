package edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp;

import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.model.Student;
import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

@SpringBootApplication
public class EregistrarwebappApplication  {


    public static void main(String[] args) {
        SpringApplication.run(EregistrarwebappApplication.class, args);
    }


}
