package com.bpotecnologia.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpotecnologia.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Bruno", "brunnoprestes@gmail.com", "11071941607", "015580");
		return ResponseEntity.ok().body(u);
	}
	
}
