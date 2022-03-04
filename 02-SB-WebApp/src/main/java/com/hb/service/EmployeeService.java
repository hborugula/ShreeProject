package com.hb.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hb.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmpDetails();
	public Employee getEmpDetailsById( Integer empNo ) throws Exception;
}
