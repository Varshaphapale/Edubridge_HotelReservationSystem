package com.example.demo.serviceimplementation;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AdminInfo;
import com.example.demo.repository.AdminInfoRepository;
import com.example.demo.service.AdminInfoService;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {

	private AdminInfoRepository repository;
	
	public AdminInfoServiceImpl(AdminInfoRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public AdminInfo updateAdmin(AdminInfo admin) {
	
		return repository.save(admin);
	}

	@Override
	public AdminInfo getAdminInfoId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<AdminInfo> getAllAdmin() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public AdminInfo saveAdmin(AdminInfo admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminInfo insertAdmin(AdminInfo admin) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAdmininfo(long id) {
		// TODO Auto-generated method stub
		repository.findById(id);	
		repository.deleteById(id);
	
	}

}