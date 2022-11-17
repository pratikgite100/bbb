package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.sample.entity.Employee;

@Repository
public class EmpRepository {
	public List<Employee> employee= new ArrayList<Employee>();

	public List<Employee> getAll() {
		return employee;
	}

}
