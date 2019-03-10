package io.joca.flightreservation.services;

public interface SecurityService {
    public boolean login(String username, String password);
}