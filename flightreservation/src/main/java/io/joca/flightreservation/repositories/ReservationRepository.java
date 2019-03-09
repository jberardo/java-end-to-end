package io.joca.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.joca.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    
}