package com.vehicle.entity;

import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AttributeOverrides({
	@AttributeOverrides(name="vid", column= @Column(name= "vid")),
	@AttributeOverrides(name="fuel", column= @Column(name= "fuel")),
	@AttributeOverrides(name="engine", column= @Column(name= "engine")),
	@AttributeOverrides(name="vtype", column= @Column(name= "vtype")),
	@AttributeOverrides(name="price", column= @Column(name= "price")),
	@AttributeOverrides(name="speed", column= @Column(name= "speed"))
})
public class TwoWheels extends Vehicle {
private int modelno;
private String modelname;
private boolean abs;
private int tyretype;
private String btype;
}
