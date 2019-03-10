package io.joca.flightreservation.services;

import io.joca.flightreservation.dto.ReservationRequest;
import io.joca.flightreservation.entities.Reservation;

public interface ReservationService {
    public Reservation bookFlight(ReservationRequest reqeust);
}