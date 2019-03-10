package io.joca.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.joca.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}