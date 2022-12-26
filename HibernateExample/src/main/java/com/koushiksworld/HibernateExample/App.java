package com.koushiksworld.HibernateExample;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.koushiksworld.HibernateExample.pojo.Movie;
import com.koushiksworld.HibernateExample.util.Util;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
    	         //Configuration con = new Configuration();
    	         //con.configure("hibernate.cfg.xml");
    	         Session session=Util.makeSession();
    	    	 System.out.println("got a session "+session);
    	    	 Movie m = new Movie();
    	    	 m.setId(1);
    	    	 m.setMovieName("Pathan");
    	    	 m.setActor("Srk");
    	    	 Transaction tr = session.beginTransaction();
    	    	 session.save(m); tr.commit(); session.close();
    	    	 System.out.println("Object is saved using hibernate");
    }
}
