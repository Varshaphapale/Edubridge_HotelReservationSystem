package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserInfoEntity;

public interface UserInfoService 
{
	//add user info method
	public UserInfoEntity addUserInfo(UserInfoEntity userInfo);
	
	//get User By Id method
	public UserInfoEntity getuserInfoById(long userId);
	
	//update User Info By Id
	public UserInfoEntity updateUserInfoById(long userId,UserInfoEntity userInfo);
	
	
	//get  User By email
	public UserInfoEntity getUserInfoByEmail(String userEmail);
	
	//getAllUserByProductId
	public List<UserInfoEntity> getAllUserByRoomId(long roomId);

	UserInfoEntity updateUserInfo(UserInfoEntity userinfo, long id);

	void deleteUserInfo(long id);

	List<UserInfoEntity> getAllUser();
	
	
}