package com.lutech.eschool.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class StudentController {

    @RequestMapping(value = "greet")
    public String greet(){
        return "Hello Lukish";
    }
}
