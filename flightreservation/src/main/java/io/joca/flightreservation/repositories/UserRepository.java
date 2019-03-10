package io.joca.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.joca.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}