package com.databse.remote.Data.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.databse.remote.Data.Types.User;

@Component
public interface UserService {
	public User getUserById(int id);

	public int createUser(User u);
	
	public List<User> getAllUsers();

}
