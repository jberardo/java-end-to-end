package io.joca.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.joca.flightcheckin.integration.dto.Reservation;
import io.joca.flightcheckin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

    private static final String RESERVATION_REST_URL = "http://localhost:8085/reservations/";

    @Override
    public Reservation findReservation(Long id) {
        RestTemplate template = new RestTemplate();
        Reservation reservatin = template.getForObject(RESERVATION_REST_URL + id, Reservation.class);
        
        return reservatin;
    }

    @Override
    public Reservation updateReservation(ReservationUpdateRequest request) {
        RestTemplate template = new RestTemplate();
        Reservation reservatin = template.postForObject(RESERVATION_REST_URL, request, Reservation.class);

        return reservatin;
    }
}