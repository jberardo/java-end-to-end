package io.joca.studentdal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Joao Berardo
 */
@Data
@Entity
@Table(name = "studenttab")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sname")
    private String name;

    @Column(name = "scourse")
    private String course;

    @Column(name = "sfee")
    private Double fee;
}