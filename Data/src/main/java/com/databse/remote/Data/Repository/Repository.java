package com.databse.remote.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.databse.remote.Data.Types.User;

public interface Repository extends JpaRepository<User, Integer>{
	
	
}
