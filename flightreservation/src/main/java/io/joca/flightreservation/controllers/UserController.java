package io.joca.flightreservation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {

    @GetMapping("/showReg")
    public String showRegistrationPage() {
        log.info("showReg called");
        return "login/registerUser";
    }
}