package io.joca.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.joca.flightreservation.entities.User;
import io.joca.flightreservation.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/showReg")
    public String showRegistrationPage() {
        log.info("showReg called");
        return "login/registerUser";
    }

    @PostMapping("/registerUser")
    public String register(@ModelAttribute("User") User user) {
        userRepository.save(user);
        return "login/login";
    }
}