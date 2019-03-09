package io.joca.flightreservation.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger extends AbstractEntity {
    private String firstName;
    private String lastMame;
    private String middleName;
    private String email;
    private String phone;
}