package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AdminInfo;

public interface AdminInfoService {
	public AdminInfo saveAdmin(AdminInfo admin);

	//update Admin
	public AdminInfo insertAdmin(AdminInfo admin);
	public AdminInfo updateAdmin(AdminInfo admin);
	
	//getAdminInfoById
	public AdminInfo getAdminInfoId(long id);
	
	//getAllAdminInfo
	public List<AdminInfo> getAllAdmin();
	public void deleteAdmininfo(long id);

}