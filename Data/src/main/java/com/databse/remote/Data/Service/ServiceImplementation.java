package com.databse.remote.Data.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.databse.remote.Data.Repository.Repository;
import com.databse.remote.Data.Types.User;


@Service
public class ServiceImplementation implements UserService{
	
	@Autowired
	private Repository myRepo; 

	
	public User getUserById(int id) {
		User u = myRepo.findById(id).get();
		return u;
	}

	
	public int createUser(User u) {
		int ret = 0; 
		
		try {
			myRepo.save(u);
			ret = 1; 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	
	public List<User> getAllUsers() {
		
		return myRepo.findAll();
	}
	
}

