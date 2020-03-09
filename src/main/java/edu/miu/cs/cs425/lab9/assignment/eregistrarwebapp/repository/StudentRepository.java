package edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.repository;

import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
