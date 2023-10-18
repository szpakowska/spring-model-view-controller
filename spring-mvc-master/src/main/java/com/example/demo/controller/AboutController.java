package com.example.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    @Slf4j
    public class AboutController {


        @GetMapping("/")
        public String getAbout(){
            log.info("tutaj jesteśmy i możemy wywoływać inne metody");
            return "about/aboutView";
        }






    }


