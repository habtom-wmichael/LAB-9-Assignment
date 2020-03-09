package edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.service;

import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getStudents();
    Student saveStudent(Student student);
    Optional<Student> findId(Integer id);
   void deleteStudent(Student student);

}
