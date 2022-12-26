package com.koushiksworld.HibernateExample.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  // this annotation specifies that the class is an entity
@Table(name= "Movie")  // the table in the db by which this entity mapped
public class Movie {
	@Id @Column 
	private int id;  // the primary key of the entity
	@Column 
	private String movieName;   // name of the column in specified table
	@Column
	private String Actor;
}
