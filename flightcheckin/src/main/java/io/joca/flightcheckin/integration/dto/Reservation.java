package io.joca.flightcheckin.integration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private Long id;
    private Boolean checkedIn;
    private Integer numberOfBags;
    private Passenger passenger;
    private Flight flight;
}