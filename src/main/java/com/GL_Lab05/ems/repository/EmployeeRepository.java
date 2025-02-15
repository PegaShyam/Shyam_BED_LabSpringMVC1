package com.GL_Lab05.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GL_Lab05.ems.entity.Employee;

@Repository
public interface EmployeeRepository 
	extends JpaRepository<Employee, Long>{
		
}
