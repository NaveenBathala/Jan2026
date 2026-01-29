package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl (EmployeeRepository employeeRepository)
	{
		this.employeeRepository=employeeRepository;
	}
	@Override
	public List<Employee> getAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getSingleRecord() {
			return null;
	}

	@Override
	public Employee createEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}

	@Override
	public void deleteEmployee(int eId) {
		employeeRepository.deleteById(eId);		
	}

	@Override
	public Employee updateEmployee(Employee e, int eId) {
		// TODO Auto-generated method stub
		return null;
	}

}
