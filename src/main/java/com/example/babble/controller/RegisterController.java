package com.example.babble.controller;

import com.example.babble.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class RegisterController {

    private UserRepository userRepository;

}
