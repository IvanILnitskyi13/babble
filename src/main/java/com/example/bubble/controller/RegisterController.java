package com.example.bubble.controller;

import com.example.bubble.service.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@AllArgsConstructor
public class RegisterController {

//    private UserRepository userRepository;

    @GetMapping("/register")
    String getRegisterForm(){
        return "register.html";
    }
}
