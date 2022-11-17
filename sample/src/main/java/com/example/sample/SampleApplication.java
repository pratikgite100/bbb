package com.example.sample;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.EmpRepository;
import com.example.sample.entity.Employee;


@SpringBootApplication
class SampleApplication implements CommandLineRunner{

	@Autowired
	EmpRepository empRepository;
	
	public static void main(String args[]) {
		SpringApplication.run(SampleApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		Employee e1=new Employee(1,"Bat Man","Bat Cave");
		Employee e2=new Employee(2,"Super Man","Kripton");
		
		empRepository.employee.add((Employee) Arrays.asList(e1,e2));
		//empRepository.employee.add((Employee) Arrays.asList(e2));
		
	}
	}
