package com.hb.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hb.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

}
