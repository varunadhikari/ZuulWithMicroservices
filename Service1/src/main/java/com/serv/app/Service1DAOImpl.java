package com.serv.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Service1DAOImpl implements Service1DAO{

	public List<Student> getStudents() {
		List<Student> list = new ArrayList<Student>();		
		list.add(new Student("varun",10));
		list.add(new Student("sahil",20));
		list.add(new Student("aakash",30));
		
		return list;
	}

}
