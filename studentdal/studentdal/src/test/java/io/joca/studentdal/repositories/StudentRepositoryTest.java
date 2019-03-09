package io.joca.studentdal.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.joca.studentdal.models.Student;
import io.joca.studentdal.repositories.StudentRepository;

/**
 * @author Joao Berardo
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
        Student student = new Student();
        student.setName("Maria");
        student.setCourse("Java");
        student.setFee(30d);

        studentRepository.save(student);
    }
    
    @Test
    public void testFindStudentById() {
        Student student = studentRepository.findById(1L).get();
        System.out.println(student.getName());
    }
}
