package com.example.alswo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/hello")
    @LogExecutionTime
    public String home(Model model) {

        model.addAttribute("안녕 ㅋㅋ", "spring !!");
        System.out.println("@@@@@@@@");
        System.out.println("@@@@@@@@");
        return "hello/hello";
    }
}
