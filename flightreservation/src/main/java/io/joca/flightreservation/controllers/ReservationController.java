package io.joca.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.joca.flightreservation.dto.ReservationRequest;
import io.joca.flightreservation.entities.Reservation;
import io.joca.flightreservation.repositories.FlightRepository;
import io.joca.flightreservation.services.ReservationService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ReservationController {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId, Model model) {
        
        log.debug("Searching flight id: " + flightId);
        model.addAttribute("flight", flightRepository.findById(flightId).orElse(null));
        return "completeReservation";
    }

    @PostMapping("/completeReservation")
    public String completeReservation(ReservationRequest request, Model model) {
        Reservation reservation = reservationService.bookFlight(request);
        model.addAttribute("msg", "Reservation created successfully with id: " + reservation.getId());
        return "reservationConfirmation";
    }
}