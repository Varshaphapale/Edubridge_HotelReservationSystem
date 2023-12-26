package com.example.demo.controller;



import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AdminInfo;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.AdminInfoService;



@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminInfoController {

	private AdminInfoService service;
	
	public AdminInfoController(AdminInfoService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<AdminInfo> insertAdmin(@RequestBody AdminInfo admin)
	{
		return new ResponseEntity<AdminInfo>(service.updateAdmin(admin),HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<AdminInfo> updateAdmin(@RequestBody AdminInfo admin)
	{
		return new ResponseEntity<AdminInfo>(service.updateAdmin(admin),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<AdminInfo> getAdminInfoById(@PathVariable("id") long id)
	{
		return new ResponseEntity<AdminInfo>(service.getAdminInfoId(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<AdminInfo>> getAllAdmin()
	{
		return new ResponseEntity<List<AdminInfo>>(service.getAllAdmin(),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteAdmininfo(@PathVariable("id")long id)
	{
		service.deleteAdmininfo(id);
		return new ResponseEntity<String>("Admin Deleted Successfully!!..",HttpStatus.OK);
	}
}