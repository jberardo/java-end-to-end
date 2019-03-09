package io.joca.flightreservation.entities;

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
public class User extends AbstractEntity {

    private String first_name;
    private String last_name;
    private String email;
    private String password;
}