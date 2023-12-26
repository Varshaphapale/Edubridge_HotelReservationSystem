package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserInfoEntity;


public interface UserService 
{
	//addUser(for register)
	public UserEntity addStudentData(UserEntity userEntity);
	
//	getUserById
	public UserEntity getUserById(String userName);
	
	//login
	public boolean loginDemo(String userName,String password);
	
	//getUserByEmail
	public UserEntity getUserByEmail(String userEmail);
	
	//updatePassword
	public UserEntity updatePassword(String email,UserEntity userEntity);

	List<UserEntity> getAllUser();

	void deleteUser(long id);

	UserEntity getUserById(Long userId);
	
	UserEntity updateUser(UserEntity user, long id);

	
}