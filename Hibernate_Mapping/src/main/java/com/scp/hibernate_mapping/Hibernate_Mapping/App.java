package com.scp.hibernate_mapping.Hibernate_Mapping;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.hibernate_mapping.pojo.Address;
import com.scp.hibernate_mapping.pojo.Employee;
import com.scp.hibernate_mapping.util.HbmUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory ssf = cfg.buildSessionFactory();

		SessionFactory nsf =HbmUtil.getSF();
		
		System.out.println("-------------------------------\nSees fact :"+nsf);
		Session session = nsf.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			Address address1 = new Address("solapur", 005, 0);
			Address address2 = new Address("pune", 38, 0);
			Employee emp1 = new Employee(1, "A", 40000, address1);
			Employee emp2 = new Employee(1, "b", 35000, address2);

			session.save(emp1);
			session.save(emp2);
			transaction.commit();

			System.out.println(session.get(Employee.class, 3));
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}

		finally {
			session.close();
		}
	}
}
