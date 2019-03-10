package io.joca.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.joca.flightreservation.dto.ReservationUpdateRequest;
import io.joca.flightreservation.entities.Reservation;
import io.joca.flightreservation.repositories.ReservationRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepository;

	@GetMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		log.debug("Inside findReservation() for id: " + id);

		return reservationRepository.findById(id).orElse(null);
	}

	@PostMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		log.debug("Inside updateReservation() for " + request);

		Reservation reservation = reservationRepository.findById(request.getId()).orElse(null);
		if (reservation == null) {
			log.error("No reservation with id " + request.getId() + " found.");
			return null;
		}
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());

		log.debug("Saving Reservation");
		return reservationRepository.save(reservation);
    }
}