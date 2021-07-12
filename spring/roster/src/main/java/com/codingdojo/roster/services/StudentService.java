package com.codingdojo.roster.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.roster.models.Student;

import com.codingdojo.roster.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository sRepo;

	
	public List<Student> getAllStudents(){
		return this.sRepo.findAll();
	}
	
	
	public Student createStudent(Student student) {
		return this.sRepo.save(student);
	}
	
	

}
