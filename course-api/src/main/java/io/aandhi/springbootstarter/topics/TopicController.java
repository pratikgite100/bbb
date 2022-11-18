package io.aandhi.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping(value="/topics", method = RequestMethod.GET)
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("spring","springFramework","springFrameworkDescriptaion")
				,new Topic("java","core java","core java description")
				, new Topic("javascipt","angular javascript","angular javascript description")
				);
	}

}
