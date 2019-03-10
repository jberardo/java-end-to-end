package io.joca.flightcheckin.integration;

import io.joca.flightcheckin.integration.dto.Reservation;
import io.joca.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
    public Reservation findReservation(Long id);
    public Reservation updateReservation(ReservationUpdateRequest request);
}