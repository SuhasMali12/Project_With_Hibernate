package controller;

import java.util.Scanner;

import entity.Student;
import service.Service;

public class Controller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student ID:");
        String studentId = sc.nextLine();
        
        Service ss = new Service();
        Student student = ss.getStudentById(studentId);
        
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
        
        sc.close();
    }
}
