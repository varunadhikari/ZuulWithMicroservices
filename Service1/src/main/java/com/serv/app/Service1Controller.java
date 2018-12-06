package com.serv.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
	@Autowired
	private Service1Service service; 

	@RequestMapping(method = RequestMethod.GET , path="/")
	public List<Student> getStudents(){
		return service.getStudents();
	}
}
