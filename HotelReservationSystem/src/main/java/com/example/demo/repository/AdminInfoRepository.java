package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AdminInfo;

public interface AdminInfoRepository extends JpaRepository<AdminInfo, Long>{

}