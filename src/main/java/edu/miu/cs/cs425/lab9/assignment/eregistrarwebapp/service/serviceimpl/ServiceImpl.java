package edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.service.serviceimpl;

import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.model.Student;
import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.repository.StudentRepository;
import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements StudentService {
   private  StudentRepository studentRepository;

    public ServiceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    @Override
    public List<Student> getStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
     return    studentRepository.save(student);
    }

    @Override
    public Optional<Student> findId(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }


}
