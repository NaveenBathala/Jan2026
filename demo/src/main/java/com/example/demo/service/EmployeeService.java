package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Employee;

public  interface EmployeeService {

	
	  public List<Employee> getAll();
	  
	 public  Employee  getSingleRecord();
	 public Employee createEmployee(Employee e);
	 public void deleteEmployee(int eId);
	 public Employee updateEmployee(Employee e , int eId);
	
}
