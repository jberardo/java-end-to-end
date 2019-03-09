package io.joca.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.joca.flightreservation.dto.ReservationRequest;
import io.joca.flightreservation.entities.Flight;
import io.joca.flightreservation.entities.Passenger;
import io.joca.flightreservation.entities.Reservation;
import io.joca.flightreservation.repositories.FlightRepository;
import io.joca.flightreservation.repositories.PassengerRepository;
import io.joca.flightreservation.repositories.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private ReservationRepository ReservationRepository;

    @Override
    public Reservation bookFlight(ReservationRequest request) {
        // make payment

        Long flightId = request.getFlightId();
        Flight flight = flightRepository.findById(flightId).orElse(null);

        Passenger passenger = new Passenger();
        passenger.setFirstName(request.getPassengerFirstName());
        passenger.setLastMame(request.getPassengerLasttName());
        passenger.setEmail(request.getPassengerEmail());
        passenger.setPhone(request.getPassengerPhone());
        Passenger savedPassenger = passengerRepository.save(passenger);

        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setCheckedIn(false);

        Reservation savedReservation = ReservationRepository.save(reservation);

        return savedReservation;
    }
}