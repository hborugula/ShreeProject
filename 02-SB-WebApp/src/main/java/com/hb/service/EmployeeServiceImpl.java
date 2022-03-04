package com.hb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hb.dao.EmployeeRepository;
import com.hb.model.Employee;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmpDetails() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee getEmpDetailsById(Integer empNo) throws Exception {
		Optional<Employee> employeeResponse = employeeRepository.findById(empNo);
		return employeeResponse.get();
	}
	
}
