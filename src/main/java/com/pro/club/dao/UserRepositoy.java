package com.pro.club.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pro.club.entities.secA.User;

public interface UserRepositoy extends JpaRepository<User, Integer> 
{
	@Query("select u from User u where u.Email =:Email")
	public User getUserByUserName(@Param("Email") String Email);
}
