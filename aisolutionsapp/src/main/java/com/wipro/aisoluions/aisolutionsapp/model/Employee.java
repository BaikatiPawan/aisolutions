package com.wipro.aisoluions.aisolutionsapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Employee {
	@Id
	@GeneratedValue
	private Long empId;
	private String empName;
	private String email;
	private Long supervisorId;
	private String supEmail;
	private String band;
	private String account;
	private String location;
	private String userType;
}
