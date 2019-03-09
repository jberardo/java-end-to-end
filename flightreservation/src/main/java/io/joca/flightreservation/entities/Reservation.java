package io.joca.flightreservation.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reservation extends AbstractEntity {
    private Boolean checked_in;
    private Integer number_of_bags;

    @OneToOne
    private Passenger passenger;

    @OneToOne
    private Flight flight;
}