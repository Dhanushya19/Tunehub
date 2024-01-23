package com.example.demo.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer>{
	public Users findByEmail(String email);
	
	

}
