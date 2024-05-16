package service;

import dao.Dao;

public class Service {
    
    public void deleteStudent(String studentId) {
        Dao dd = new Dao();
        dd.deleteStudent(studentId);
    }
}
