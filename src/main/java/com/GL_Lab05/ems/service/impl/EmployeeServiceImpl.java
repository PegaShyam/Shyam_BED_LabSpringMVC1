package com.GL_Lab05.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GL_Lab05.ems.entity.Employee;
import com.GL_Lab05.ems.repository.EmployeeRepository;
import com.GL_Lab05.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> list() {
		
		return employeeRepository.findAll();
	}
	
	@Override
	public void save(Employee employee) {
	    employeeRepository.save(employee);                    
	}
	
	@Override
	public Employee findById(Long employeeID) {
	    return employeeRepository.findById(employeeID).get();
	}
	
	@Override
	public void deleteById(Long employeeId) {
	    employeeRepository.deleteById(employeeId);    
	} 

}
