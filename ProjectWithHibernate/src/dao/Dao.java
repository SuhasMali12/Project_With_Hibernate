package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class Dao {

	public List<Student> m1() {

		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Criteria cr = ss.createCriteria(Student.class);
		List<Student> list = cr.list();
		ss.close();
        return list;

	}

}
