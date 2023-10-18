package com.example.demo.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ExperienceController {
    @GetMapping("/")
    public String getExperience() {
        log.info("tutaj jesteśmy i możemy wywoływać inne metody");
        return "experience/experienceView";
    }
}
