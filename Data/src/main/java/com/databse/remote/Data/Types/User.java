package com.databse.remote.Data.Types;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "joseluiFranciscoTable")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 25)
	private String name; 
	@Size(max = 25)
	private String lastname; 

	@Size(max = 20)
	private String phoneNumber; 
	@Size(max = 25)
	private String email; 
	
	public User() {
		
	}
	
	public User(int id, String name, String lastname,
			String phoneNumber,  String email) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
