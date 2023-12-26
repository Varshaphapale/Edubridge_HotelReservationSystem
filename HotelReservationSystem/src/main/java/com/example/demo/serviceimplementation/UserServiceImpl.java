package com.example.demo.serviceimplementation;


import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserInfoEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserEntity addStudentData(UserEntity userEntity) 
	{	
		return userRepository.save(userEntity);
	}

	public UserEntity getUserById(String userName) 
	{	
		return userRepository.findById(userName).get();
	}

	@Override
	public boolean loginDemo(String userName, String userPassword)
	{
		boolean result;
		
		if(userRepository.existsById(userName))
		{
			String password = userRepository.findUserPassword(userName);
			if(password.equals(userPassword))
			{
				result=true;
			}
			else
			{
				result=false;
				
			}
		}
		else
		{
			result=false;
			
			
		}
		
		return result;
	}

	@Override
	public UserEntity getUserByEmail(String userEmail) 
	{
	
		return userRepository.getUserByEmail(userEmail);
	}

	@Override
	public UserEntity updatePassword(String email,UserEntity userEntity) 
	{
		return userRepository.save(userEntity);
	}

	@Override
	public UserEntity getUserById(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId);
	}

//	@Override
//	public User getAllUserById() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<UserEntity> getAllUser() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public List<UserEntity> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		//employee existed or not??
		//userRepository.findById(id).orElseThrow(()->new ResourceNotFound("User","id","id"));
		userRepository.deleteById(id);
	}
	
	@Override
	public UserEntity updateUser(UserEntity user, long id) {
		//we need to check employee with given id is existed or not
		//UserInfoEntity existingEmployee=userInfoRepository.findById(id).orElseThrow(()->new ResourceNotFound("UserInfoEntity","id","id"));
		user.setUserName(user.getUserName());
		user.setUserPassword(user.getUserPassword());
		user.setUserEmail(user.getUserEmail());
	
		userRepository.save(user);
		return user;
		
		// TODO Auto-generated method stub
		
	}

	
	

}