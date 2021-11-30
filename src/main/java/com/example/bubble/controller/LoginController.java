package com.example.bubble.controller;

import com.example.bubble.service.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class LoginController {

    private UserRepository userRepository;

    @GetMapping("/login")
    String getLoginForm(){
        return "loginForm.html";
    }
}
