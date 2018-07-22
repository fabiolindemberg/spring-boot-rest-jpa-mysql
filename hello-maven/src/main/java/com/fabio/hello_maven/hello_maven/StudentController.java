package com.fabio.hello_maven.hello_maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;;

@Controller
@RequestMapping(path="/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping(path="/add")
	public @ResponseBody String addStudent (@RequestParam String name) {
		Student student = new Student();
		
		student.setName(name);
		studentRepository.save(student);
		
		return "Saved!";
	}
	
}
