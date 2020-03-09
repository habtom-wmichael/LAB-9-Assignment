package edu.miu.cs.cs425.lab9.assignment.eregistrarwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value = "/home")
    public String display(){

        return"home/index";
    }
}
