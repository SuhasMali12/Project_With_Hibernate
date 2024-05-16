package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class Dao {
    
    public void deleteStudent(String studentId) {
        Configuration cfg = new Configuration();
        cfg.configure().addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.delete(student);
                System.out.println("Student with ID " + studentId + " deleted successfully.");
            } else {
                System.out.println("Student with ID " + studentId + " not found.");
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
