package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("/tasks")
    public String getTaskList() {

        return "tasks";
    }

    @GetMapping("/addTask")
    public String getAddTask() {

        return "addTask"; //
    }

}
