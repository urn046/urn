package com.scp.hbm.Hbm_onetoone_bi;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.hbm.pojo.Student;
import com.scp.hbm.pojo.University;
import com.scp.hbm.util.HbmUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		
		
	
	Configuration cfg = new Configuration().configure();
	
	SessionFactory ssf = cfg.buildSessionFactory();

	SessionFactory nsf =HbmUtil.getSF();
	
	
	Session session = nsf.openSession();
	Transaction transaction = null;

	try {
		transaction = session.beginTransaction();
		
		University u1=new University("pune");
		
		Student s1=new Student("bb");
		
		s1.setUni(u1);
		u1.setStudent(s1);
		
		session.save(s1);
		
		List<Student> students = (List<Student>)session.createQuery("from Student ").list();
        for(Student s: students){
            System.out.println("\n Student Details : "+s);
        }
		
		
		transaction.commit();
		session.close();


	
	} catch (HibernateException e) {
		transaction.rollback();
		e.printStackTrace();
	}

	finally {
		session.close();
	}
}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
