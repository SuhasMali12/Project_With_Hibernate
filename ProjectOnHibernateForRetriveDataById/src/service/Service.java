package service;

import dao.Dao;
import entity.Student;

public class Service {

    public Student getStudentById(String studentId) {
        Dao dd = new Dao();
        return dd.getStudentById(studentId);
    }
}
