package io.joca.studentdal.repositories;

import org.springframework.data.repository.CrudRepository;

import io.joca.studentdal.models.Student;

/**
 * @author Joao Berardo
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
}