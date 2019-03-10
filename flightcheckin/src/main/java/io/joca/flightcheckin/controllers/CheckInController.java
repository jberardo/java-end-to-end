package io.joca.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.joca.flightcheckin.integration.ReservationRestClient;
import io.joca.flightcheckin.integration.dto.Reservation;
import io.joca.flightcheckin.integration.dto.ReservationUpdateRequest;


@Controller
public class CheckInController {

    @Autowired
    ReservationRestClient restClient;

    @GetMapping("/showStartCheckIn")
    public String showStartCheckIn() {
        return "startCheckIn";
    }

    @PostMapping(value="/startCheckIn")
    public String startCheckIn(@RequestParam("reservationId") Long reservationId, Model model) {
        Reservation reservation = restClient.findReservation(reservationId);
        model.addAttribute("reservation", reservation);

        return "displayReservationDetails";
    }

    @PostMapping(value="/completeCheckIn")
    public String completeCheckIn(@RequestParam("reservationId") Long reservationId, @RequestParam("numberOfBags") int numberOfBags, Model model) {
        ReservationUpdateRequest request = new ReservationUpdateRequest();
        request.setId(reservationId);
        request.setCheckedIn(true);
        request.setNumberOfBags(numberOfBags);

        restClient.updateReservation(request);

        return "checkInConfirmation";
    }
}