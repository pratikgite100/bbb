package io.aandhi.springbootstarter.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.aandhi.springbootstarter.topics.Topic;

@RestController
public class HelloController {
	
	@RequestMapping(value="/Topic", method = RequestMethod.GET)
	public String helloWorld() {
		return "Welcome to Spring Boot World!!";
	}
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Topic> getAllTopics() {
		//System.out.println("Welcome to Spring Boot World!!");
		return Arrays.asList(new Topic("101","Pratik Gite","Software Engineer at einfochips")
				,new Topic("102","Amit Deshmukh","Mech Student")
				, new Topic("103","Sagar Gite","Neavy Officer"),
				new Topic("104","Tushar Pokharkar","Btech Food Student"),
				new Topic("105","Pravin Gite","IT Student"),
				new Topic("106","Manoj Patil","Software Engineer at 3DS"),
				new Topic("107","Chinmay Sasawade","Software Engineer at Capgemini"),
				new Topic("108","Vrushank Gaurshete","Software Engineer at TCS")
				);
		  
		}
	
	@RequestMapping("/hello")
	public String sayHI() {
		return "Hi";
	}  

}
