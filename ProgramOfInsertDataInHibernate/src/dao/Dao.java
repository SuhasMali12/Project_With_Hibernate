package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import controller.Controller;
import entity.Student;

public class Dao {

    private SessionFactory sessionFactory;

    public Dao() {
        Configuration cfg = new Configuration();
        cfg.configure().addAnnotatedClass(Student.class);
        sessionFactory = cfg.buildSessionFactory();
    }

    public void insertStudent(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            System.out.println("Student inserted successfully!");
            } 
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            }
        finally {
            session.close();
        }
    }
    public static void main(String[] args) {
        Controller cc = new Controller();
        cc.insertStudentData();
    }
}
