package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.StudentEntity;
import com.repository.StudentRepository;

@Controller
public class SessionController {

	@Autowired
	StudentRepository studentRepo;

	@GetMapping("/signup")
	public String signup() {
		return "Signup";
	}

	@PostMapping("/savestudent")
	public String saveStudent(StudentEntity student) {
		studentRepo.save(student);
		return "Signup";
	}
}
