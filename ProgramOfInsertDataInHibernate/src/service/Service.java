package service;

import dao.Dao;
import entity.Student;

public class Service {

    private Dao dao;

    public Service() {
        this.dao = new Dao();
    }

    public void insertStudent(Student s) {
        dao.insertStudent(s);
    }
}
