package com.example.bubble.controller;

import com.example.bubble.service.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class MainPageController {

    private UserRepository userRepository;

    @GetMapping("/{login}")
    String getMainPage(@PathVariable String login){
        return "mainPage.html";
    }


}
