package io.joca.flightreservation.entities;

import javax.persistence.Column;
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

    @Column(name = "checked_in")
    private Boolean checkedIn;

    @Column(name = "number_of_bags")
    private Integer numberOfBags;

    @OneToOne
    private Passenger passenger;

    @OneToOne
    private Flight flight;
}