package com.hb.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hb.model.Employee;
import com.hb.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class EmployeeController {

	private EmployeeService employeeService;
	
	@GetMapping("/getEmpDetails")
	public List<Employee> getEmpDetails(){
		return employeeService.getEmpDetails();
	}
	
	@GetMapping("/getEmpDetails/{empNo}")
	public Employee getEmpDetailsById(@PathVariable("empNo") Integer empNo) throws Exception{
		return employeeService.getEmpDetailsById( empNo );
	}
	
}
