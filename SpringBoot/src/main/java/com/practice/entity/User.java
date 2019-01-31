package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="user",indexes= @Index(columnList="first_name,last_name,age"))
//@CheckPasswordMatch
public class User extends BaseEntity {

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private int age;

	private String email;

	private String login;
	
	private String password;
	
}
