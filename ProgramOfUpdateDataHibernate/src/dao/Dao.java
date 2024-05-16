package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class Dao {

    public void updateStudentData(String studentId, String newName, String newAge, String newGrade) {
        Configuration cfg = new Configuration();
        cfg.configure().addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Student s = session.get(Student.class, studentId);
            if (s != null) {
                s.setStudent_name(newName);
                s.setAge(newAge);
                s.setGrade(newGrade);
                session.update(s);
                transaction.commit();
                System.out.println("Student data updated successfully!");
            } else {
                System.out.println("Student with ID " + studentId + " not found!");
            }
            } 
            catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            } 
            finally {
            session.close();
            sf.close();
        }
    }
}
