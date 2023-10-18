package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/students")
    public String getStudentList() {

        return "personList";
    }

    @GetMapping("/addStudent")
    public String getAddStudent() {

        return "addNewPerson";
    }

    @GetMapping("/editStudent")
    public String getEditStudent() {

        return "editPerson";
    }
}
