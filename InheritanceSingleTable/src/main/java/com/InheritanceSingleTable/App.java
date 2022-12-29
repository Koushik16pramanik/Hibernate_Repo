package com.InheritanceSingleTable;

import com.Vehicle.entity.daoImpl.daoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 daoImpl dao = new daoImpl();
         dao.addVehicle();
    }
}
