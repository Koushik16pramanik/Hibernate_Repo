package com.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  // this annotation specifies that the class is an entity
@Table(name= "Employee_Details")  // the table in the db by which this entity
public class Employee{
	@Id
	private int empId;  // the primary key of the entity private String
	private String empFirstName, empLastName, empEmail, empAddr;
	private double empSalary;
	private long empPhone;
}

