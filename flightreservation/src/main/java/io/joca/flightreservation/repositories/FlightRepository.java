package io.joca.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.joca.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    
}