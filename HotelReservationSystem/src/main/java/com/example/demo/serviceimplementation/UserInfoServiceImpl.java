package com.example.demo.serviceimplementation;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfoEntity;
//import com.example.demo.exception.ResourceNotFound;
import com.example.demo.repository.UserInfoRepository;
import com.example.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService
{
	private UserInfoRepository userInfoRepository;
	
	public UserInfoServiceImpl(UserInfoRepository userInfoRepository) {
		super();
		this.userInfoRepository = userInfoRepository;
	}

	@Override
	public UserInfoEntity addUserInfo(UserInfoEntity userInfo) 
	{
		return userInfoRepository.save(userInfo);
	}

	@Override
	public UserInfoEntity getuserInfoById(long userId) 
	{
		return userInfoRepository.findById(userId).get();
	}

	@Override
	public UserInfoEntity updateUserInfoById(long userId, UserInfoEntity userInfo)
	{	
		return userInfoRepository.save(userInfo);
	}

	@Override
	public UserInfoEntity getUserInfoByEmail(String userEmail) 
	{
		return userInfoRepository.findUserByEmail(userEmail);
	}

	@Override
	public List<UserInfoEntity> getAllUserByRoomId(long roomId) 
	{
		return userInfoRepository.getAllUserByProductId(roomId);
	}

	@Override
	public List<UserInfoEntity> getAllUser() {
		// TODO Auto-generated method stub
		return userInfoRepository.findAll();
	}
	@Override
	public void deleteUserInfo(long id) {
		// TODO Auto-generated method stub
		//employee existed or not??
		//userInfoRepository.findById(id).orElseThrow(()->new ResourceNotFound("UserInfo","id","id"));
		userInfoRepository.deleteById(id);
	}
	@Override
	public UserInfoEntity updateUserInfo(UserInfoEntity userinfo, long id) {
		//we need to check employee with given id is existed or not
		//UserInfoEntity existingEmployee=userInfoRepository.findById(id).orElseThrow(()->new ResourceNotFound("UserInfoEntity","id","id"));
		userinfo.setUserFirstName(userinfo.getUserFirstName());
		userinfo.setUserLastName(userinfo.getUserLastName());
		userinfo.setUserEmail(userinfo.getUserEmail());
		userinfo.setUserAge(userinfo.getUserAge());
		userinfo.setUserContactNumber(userinfo.getUserContactNumber());
		userinfo.setUserGender(userinfo.getUserGender());
		userinfo.setUserCountry(userinfo.getUserCountry());
        userinfo.setUserState(userinfo.getUserState());
		userinfo.setUserAddress(userinfo.getUserAddress());
		//userinfo.setUserGender(userinfo.getUserGender());
		//userinfo.setUserGender(userinfo.getUserGender());

		
		
		
		
		//Save existing employee to DB
		userInfoRepository.save(userinfo);
		return userinfo;
		
		// TODO Auto-generated method stub
		
	}
}