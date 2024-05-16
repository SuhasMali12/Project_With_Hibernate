package service;

import java.util.List;

import dao.Dao;
import entity.Student;

public class Service {
	
	public List<Student> m1() {
		
		Dao d1 = new Dao();
		List<Student> list = d1.m1(); 
		
		return list;
		
		
		
	}

}
