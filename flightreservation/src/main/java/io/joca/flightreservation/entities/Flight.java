package io.joca.flightreservation.entities;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flight extends AbstractEntity {

    private String flightNumber;

    @Column(name = "operating_airlines")
    private String operatingAirlines;

    @Column(name = "departure_city")
    private String departureCity;

    @Column(name = "arrival_city")
    private String arrivalCity;

    @Column(name = "date_of_departure")
    private LocalDate dateOfDeparture;

    @Column(name = "estimated_departure_time")
    private Timestamp estimatedDepartureTime;
}