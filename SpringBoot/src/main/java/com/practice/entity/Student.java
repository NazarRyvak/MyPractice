package com.practice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student", indexes= @Index(columnList="first_name,last_name"))
@Data
public class Student extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;


	private int age;

	//@NotEmpty(message = "Student`s country field can`t be null")
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="student_details_id")
	private StudentDetails studentDetails;

}
