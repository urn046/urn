package com.scp.hbm.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbmUtil {

	static Configuration cfg=new Configuration().configure();
    static SessionFactory ssf=null;
     
    public static  SessionFactory getSF(){
    	 if(ssf == null){
    		 ssf=cfg.buildSessionFactory();
    	 }
    	 
    	 return ssf;
     }

}
