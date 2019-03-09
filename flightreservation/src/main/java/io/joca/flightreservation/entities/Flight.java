package io.joca.flightreservation.entities;

import java.sql.Timestamp;
import java.time.LocalDate;

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
    private String operating_airlines;
    private String departure_city;
    private String arrival_city;
    private LocalDate date_of_departure;
    private Timestamp estimated_departure_time;
}