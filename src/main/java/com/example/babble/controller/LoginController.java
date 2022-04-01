package com.example.babble.controller;

import com.example.babble.model.User;
import com.example.babble.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("login/")
@RequiredArgsConstructor
public class LoginController {

    private final UserRepository userRepository;

    @GetMapping("/login/{email}")
    User getUser(@PathVariable String email){
        //User user userRepository.findByEmail(email);
        return userRepository.findByEmail(email);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)
    User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @DeleteMapping("/login/{id}")
    void deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
