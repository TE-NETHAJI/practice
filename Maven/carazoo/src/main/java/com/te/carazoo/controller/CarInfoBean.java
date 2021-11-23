package com.te.carazoo.controller;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="carinfo")
@Entity
@NoArgsConstructor
public class CarInfoBean implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Id")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Company")
	private String company;

	@Column(name="Fuel_Type")
	private String fuelType;
	
	@Column(name="Power_Steering")
	private Boolean powerSteering;
	
	@Column(name="Showroom_Price")
	private Double showroomPrice;
	
	@Column(name="Onroad_Price")
	private Double onroadPrice;
	
	@Column(name="Break_System")
	private String breakSystem;
	
	@Column(name="Image_URL")
	private String imageURL;
	
	@Column(name="Mileage")
	private Double mileage;
	
	@Column(name="Seating_Capacit")
	private Integer seatingCapacit;
	
	@Column(name="Engine_Capacity")
	private Integer engineCapacity;
	
	@Column(name="Gear_Type")
	private String gearType;
	

}
