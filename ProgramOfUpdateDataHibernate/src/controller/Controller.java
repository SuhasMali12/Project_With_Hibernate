package controller;

import entity.Student;
import service.Service;

public class Controller {

    public void updateStudentData(String studentId, String newName, String newAge, String newGrade) {
        Service ss = new Service();
        ss.updateStudent(studentId, newName, newAge, newGrade);
    }

    public static void main(String[] args) {
        Controller cc = new Controller();
       
        cc.updateStudentData("2", "John Doe", "35", "10");
    }
}
