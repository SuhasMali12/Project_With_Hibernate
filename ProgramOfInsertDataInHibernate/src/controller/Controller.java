package controller;

import java.util.Scanner;
import entity.Student;
import service.Service;

public class Controller {
    
    private Service service;

    public Controller() {
        this.service = new Service();
    }

    public void insertStudentData() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter student ID:");
        String id = sc.nextLine();
        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("Enter student age:");
        String age = sc.nextLine();
        System.out.println("Enter student grade:");
        String grade = sc.nextLine();
        
        Student s = new Student();
        s.setStudent_id(id);
        s.setStudent_name(name);
        s.setAge(age);
        s.setGrade(grade);

        service.insertStudent(s);
    }
}
