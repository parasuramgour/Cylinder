package com.demo.main.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cylinder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cylinderId;
	private String cylinderType;
	private float cylinderWeight;
	private String strapcolor;
	private float cylinderPrice;
	private String cylinderName;

	public Cylinder() {
		super();
	}

	public Cylinder(long cylinderId, String cylinderType, float cylinderWeight, String strapcolor, float cylinderPrice,
			String cylinderName) {
		super();
		this.cylinderId = cylinderId;
		this.cylinderType = cylinderType;
		this.cylinderWeight = cylinderWeight;
		this.strapcolor = strapcolor;
		this.cylinderPrice = cylinderPrice;
		this.cylinderName = cylinderName;
	}

	public long getCylinderId() {
		return cylinderId;
	}

	public void setCylinderId(long cylinderId) {
		this.cylinderId = cylinderId;
	}

	public String getCylinderType() {
		return cylinderType;
	}

	public void setCylinderType(String cylinderType) {
		this.cylinderType = cylinderType;
	}

	public float getCylinderWeight() {
		return cylinderWeight;
	}

	public void setCylinderWeight(float cylinderWeight) {
		this.cylinderWeight = cylinderWeight;
	}

	public String getStrapcolor() {
		return strapcolor;
	}

	public void setStrapcolor(String strapcolor) {
		this.strapcolor = strapcolor;
	}

	public float getCylinderPrice() {
		return cylinderPrice;
	}

	public void setCylinderPrice(float cylinderPrice) {
		this.cylinderPrice = cylinderPrice;
	}

	public String getCylinderName() {
		return cylinderName;
	}

	public void setCylinderName(String cylinderName) {
		this.cylinderName = cylinderName;
	}

}
