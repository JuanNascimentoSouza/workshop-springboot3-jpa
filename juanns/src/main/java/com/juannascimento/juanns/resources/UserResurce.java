package com.juannascimento.juanns.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juannascimento.juanns.entities.User;

@RestController	
@RequestMapping(value = "/users")
public class UserResurce {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1,"Maria","Maria@gmail.com","999999999","12345");
		return ResponseEntity.ok().body(u);
	}
}
