package io.joca.flightreservation.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.joca.flightreservation.repositories.FlightRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @PostMapping("/findFlight")
    public String findFlights(
        @RequestParam("from") String from,
        @RequestParam("to") String to,
        @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") LocalDate departureDate, Model model) {
        
        log.debug("Searching flights");
        model.addAttribute("flights", flightRepository.findFlights(from, to, departureDate));
        return "displayFlights";
    }
}