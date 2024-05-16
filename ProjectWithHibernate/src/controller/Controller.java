package controller;

import java.util.List;

import entity.Student;
import service.Service;

public class Controller {
	
	public void m1() {
		
		Service sss =new Service();
		List<Student> list = sss.m1();
		
		for (Student student : list) {
			
			System.out.println(student);
			
		}
		
	}
	public static void main(String[] args) {
		
		Controller cc = new Controller();
		cc.m1();
		
	}

}
