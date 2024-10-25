package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s =  sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setFirstName("Karuna");
		e1.setLastName("Mishra");
		
		s.save(e1);
		
		t.commit();
		s.close();
		
	}

}
