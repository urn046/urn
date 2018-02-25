package com.scp.hbm.Hbm_onetomany_uni;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.hbm.Hbm_pojo.Bank;
import com.scp.hbm.Hbm_pojo.Employee;
import com.scp.hbm.util.HbmUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	Configuration cfg = new Configuration().configure();
    	
    	//SessionFactory ssf = cfg.buildSessionFactory();

    	SessionFactory nsf =HbmUtil.getSF();
    	
    	
    	Session session = nsf.openSession();
    	Transaction transaction = null;

    	try {
    		transaction = session.beginTransaction();
    		Bank bank1 = new Bank("ICICI");
    		Bank bank2 = new Bank("Axis");
    		Bank bank3 = new Bank("IdusInd");
    		Bank bank4 = new Bank("BOI");
    		Bank bank5 = new Bank("SBI");
    		Set<Bank> setBank1 =new HashSet<Bank>();
    		setBank1.add(bank5);
    		setBank1.add(bank4);
    		setBank1.add(bank3);
    		
    		
    		Set<Bank> setBank2 =new HashSet<Bank>();
    		setBank1.add(bank2);
    		setBank1.add(bank1);
    		
    		
    		Employee e1 =new Employee(0,"raju", setBank1);
    		Employee e2 =new Employee(1,"sagu", setBank2);
    		
    		e1.setBank(setBank1);
    		e2.setBank(setBank2);
    		
    		session.save(e1);
            session.save(e2);
     
            session.getTransaction().commit();
    		
    		
    	} catch (HibernateException e) {
    		transaction.rollback();
    		e.printStackTrace();
    	}

    	finally {
    		session.close();
    	}

    }
}
