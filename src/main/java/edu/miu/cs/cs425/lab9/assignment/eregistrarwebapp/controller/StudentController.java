package edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.controller;

import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.model.Student;
import edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping(value = {"/student/list", "/eregistrar/student/list"})
    public ModelAndView getModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> students = studentService.getStudents();
        modelAndView.addObject("students", students);
        modelAndView.addObject("numberOfStudents", students.size());
        modelAndView.setViewName("/student/list");
        return modelAndView;
    }

    @GetMapping(value = "/Student/new")
    public String addNewStudent() {
        // model.addAttribute("student", new Student());

        return "student/new";
    }

    @PostMapping(value = "/newStudentForm")
    public String saveNewStudentToDB(@Valid Student student, BindingResult result, Model model) {

        if (result.hasErrors()) {
            System.out.println(" error");
            return "student/new";
        }
        studentService.saveStudent(student);

        return "redirect:/student/list";
    }

    @GetMapping("/student/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Student student = studentService.findId(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));

        model.addAttribute("student", student);
        System.out.println("Student....."+ student.getFirstName());
        return "student/edit";
    }
    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id, Model model) {
        System.out.println("In delete method");
        Student student = studentService.findId(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        studentService.deleteStudent(student);
        model.addAttribute("students", studentService.getStudents());
        return "redirect:/student/list";
    }

    @GetMapping(value = "/Student/about")
    public String displayAbout(Model model) {


        return "student/about";
    }
}
