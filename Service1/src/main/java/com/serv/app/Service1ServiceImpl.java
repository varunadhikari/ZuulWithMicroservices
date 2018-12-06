package com.serv.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1ServiceImpl implements Service1Service{

	@Autowired
	private Service1DAO dao;
	
	public List<Student> getStudents() {
		return dao.getStudents();
	}

}
