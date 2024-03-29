package io.joca.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.joca.flightreservation.dto.UserDto;
import io.joca.flightreservation.entities.User;
import io.joca.flightreservation.repositories.UserRepository;
import io.joca.flightreservation.services.SecurityService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    SecurityService securityService;

    @GetMapping("/showReg")
    public String showRegistrationPage() {
        log.debug("showReg called");
        return "login/registerUser";
    }

    @PostMapping("/registerUser")
    public String register(@ModelAttribute("User") UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(encoder.encode(userDto.getPassword()));
        userRepository.save(user);

        return "login/login";
    }

    @GetMapping("/showLogin")
    public String showLogin() {
        log.debug("showLogin called");
        return "login/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        log.info("Trying to log in user: " + email + " using: " + password);
        if (securityService.login(email, password)) {
            log.debug("Login sucess");
            return "findFlights";
        } else {
            log.debug("Login failed");
            model.addAttribute("msg", "Invalid email or password. Please try again.");
        }
        
        return "login/login";
    }
}