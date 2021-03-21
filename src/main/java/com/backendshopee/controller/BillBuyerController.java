package com.backendshopee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.UserEntity;
import com.backendshopee.service.IUserService;

@RestController
@RequestMapping("/api/v1/billuser/")
public class BillBuyerController {
	@Autowired
	IUserService iUserService;
	
	@GetMapping("/allBill")
	public UserEntity allCart() {
		return iUserService.findByName("admin");
	}
}
