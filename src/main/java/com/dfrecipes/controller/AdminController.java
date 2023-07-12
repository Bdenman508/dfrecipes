package com.dfrecipes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Admin;
import com.learning.repo.AdminRepo;

@CrossOrigin 
@RequestMapping("/api/admin")
@RestController
public class AdminController {

	@Autowired
	AdminRepo adminRepo;
	
	@GetMapping("/getadmin")
	List<Admin> getAdmin(){
		return adminRepo.findAll();
	}
	@PostMapping("/addadmin")
	Admin addNewAdmin(@RequestBody Admin admin) {
			return adminRepo.save(admin);
		}
}
