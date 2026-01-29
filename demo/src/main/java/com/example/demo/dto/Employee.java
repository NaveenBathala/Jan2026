package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String eName;
	private String eLocation;
	private long salary;
	public int getEId() {
	    return eId;
	}

	public void setEId(int eId) {
	    this.eId = eId;
	}

	public String getEName() {
	    return eName;
	}

	public void setEName(String eName) {
	    this.eName = eName;
	}

	public String getELocation() {
	    return eLocation;
	}

	public void setELocation(String eLocation) {
	    this.eLocation = eLocation;
	}

	public long getSalary() {
	    return salary;
	}

	public void setSalary(long salary) {
	    this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eLocation=" + eLocation + ", salary=" + salary + "]";
	}
	public Employee(int eId, String eName, String eLocation, long salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eLocation = eLocation;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
