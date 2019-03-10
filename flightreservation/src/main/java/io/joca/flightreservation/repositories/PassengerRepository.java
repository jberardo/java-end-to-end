package io.joca.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.joca.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    
}