package controller;

import service.Service;

public class Controller {
    
    public void deleteStudent(String studentId) {
        Service ss = new Service();
        ss.deleteStudent(studentId);
    }
    
    public static void main(String[] args) {
        Controller cc = new Controller();
        cc.deleteStudent("2");
    }
}
