package com.example.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EmpRepository;
import com.example.sample.entity.Employee;

@Service
public class EmpService {

	@Autowired
	EmpRepository empRepository;
	
	
	public List<Employee> getAll() {
		return empRepository.getAll();
	}

}
