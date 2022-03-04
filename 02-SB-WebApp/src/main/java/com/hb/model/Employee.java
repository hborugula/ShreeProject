package com.hb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "emp")
@NoArgsConstructor
@Data
@ToString
public class Employee {

	@Id
	@Column(name = "empno")
	private Integer empNo;

	@Column(name = "ename")
	private String ename;

	@Column(name = "job")
	private String job;

	@Column(name = "mgr")
	private Integer mgr;

	@Column(name = "hiredate")
	private Date hireDate;

	@Column(name = "sal")
	private Double salary;

	@Column(name = "comm")
	private Double comm;

	@Column(name = "deptno")
	private Integer deptNo;

}
