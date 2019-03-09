package io.joca.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.joca.flightreservation.repositories.FlightRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ReservationController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId, Model model) {
        
        log.debug("Searching flight id: " + flightId);
        model.addAttribute("flight", flightRepository.findById(flightId).orElse(null));
        return "completeReservation";
    }
}