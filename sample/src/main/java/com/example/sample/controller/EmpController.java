package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entity.Employee;
import com.example.sample.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	
	@GetMapping("/get/all")
	public List<Employee> getAll(){
		return empService.getAll();
	}
	
}