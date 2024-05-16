package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class Dao {

    public Student getStudentById(String studentId) {
        Configuration cfg = new Configuration();
        cfg.configure().addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction transaction = null;
        Student student = null;
        
        try {
            transaction = session.beginTransaction();
            student = session.get(Student.class, studentId);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        
        return student;
    }
}
