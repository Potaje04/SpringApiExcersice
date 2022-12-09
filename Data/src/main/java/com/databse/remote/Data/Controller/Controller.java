package com.databse.remote.Data.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.databse.remote.Data.Service.UserService;
import com.databse.remote.Data.Types.User;


@RestController
@RequestMapping("users")
@CrossOrigin(origins = "*")
public class Controller {
	
	
	@Autowired
	private UserService s; 
	
	private Logger loggerController = LoggerFactory.getLogger(getClass()); 
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id ) { 
		loggerController.info("User with id: " +id+" returned.");
		return s.getUserById(id);
	}
	
	@GetMapping("/")
	public List<User> getAllUsers(){
		loggerController.info("Retrieving all users");
		return s.getAllUsers();
	}
	
	
	@PostMapping("/create")
	public String createUser(@RequestBody User u ) {
		loggerController.info("Creating user...");
		return (s.createUser(u) == 1 ? "ok" : "err"); 
	}
	 
	
	
}
