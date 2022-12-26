package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory s = new Configuration().configure().buildSessionFactory();
        Session ses = s.openSession();
        Transaction t = ses.beginTransaction();
        Employee e =new Employee();
        e.setEmpId(101);
        e.setEmpFirstName("Koushik");
        e.setEmpLastName("Pramanik");
        e.setEmpEmail("koushikpramanik@gmail.com");
        e.setEmpPhone(123456789);
        e.setEmpAddr("Garhbeta");
        e.setEmpSalary(15400.32);
        ses.save(e);
        t.commit();
        ses.close();
    }
}
