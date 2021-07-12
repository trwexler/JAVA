package com.codingdojo.roster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.roster.models.Student;
import com.codingdojo.roster.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService sService;
	
	
	@RequestMapping("/students")
		public String index(Model model) {
		model.addAttribute("students", this.sService.getAllStudents());
		return "index.jsp";
	}
	
    @RequestMapping("/students/new")
	public String createStudent(@ModelAttribute("students") Student student) {
		return "new.jsp";
	}	
   
	@PostMapping("/new")
		public Student addStudent( @ModelAttribute("students") Student student, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("error");
		}
		return this.sService.createStudent(student);
	}
	


}
