package com.demo.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.Entity.User;

@Repository
public interface UserRerpository  extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);


}
