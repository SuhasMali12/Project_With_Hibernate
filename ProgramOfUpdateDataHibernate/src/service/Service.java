package service;

import dao.Dao;

public class Service {

    public void updateStudent(String studentId, String newName, String newAge, String newGrade) {
        Dao dao = new Dao();
        dao.updateStudentData(studentId, newName, newAge, newGrade);
    }
}
