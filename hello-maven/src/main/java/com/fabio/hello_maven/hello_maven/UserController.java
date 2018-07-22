package com.fabio.hello_maven.hello_maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public @ResponseBody User getUser(@RequestBody User input) {
		String email = input.getEmail();
		String password = input.getPassword();
		User user = userRepository.findByEmailAndPassword(email, password);
		
		return user;
		
	}

}
