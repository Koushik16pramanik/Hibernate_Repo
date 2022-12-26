package com.onetomany.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name= "item")
@Entity
public class Items {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
private int id;
private String itemname;
private double price;
private int quantity;
}

