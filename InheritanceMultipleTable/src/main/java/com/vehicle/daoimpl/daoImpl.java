package com.vehicle.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vehicle.config.HibernateUtil;
import com.vehicle.entity.FourWheels;
import com.vehicle.entity.TwoWheels;

public class daoImpl {

	public void addVehicle() {
		Session session = HibernateUtil.activateSession();
		Transaction t = session.beginTransaction();
		TwoWheels tw= new TwoWheels();
		tw.setFuel("petrol");
		tw.setEnginePower("5000cc");
		tw.setSpeed(200);
		tw.setVtype("Bike");
		tw.setPrice(200000);
		tw.setModelno(1234);
		tw.setModelname("abc");
		tw.setAbs(true);
		tw.setBtype("SportBike");
		
		FourWheels fw= new FourWheels();
		fw.setFuel("electric");
		fw.setEnginePower("100cc");
		fw.setSpeed(400);
		fw.setVtype("car");
		fw.setPrice(8000000);
		fw.setModelno(54321);
		fw.setModelname("Audi");
		fw.setMusicsystem(true);
		fw.setEtype("auto");
		fw.setAc(true);
		
		session.save(tw);
		session.save(fw);
		
		t.commit();
		System.out.println("joining done.....");
		
	}
}
