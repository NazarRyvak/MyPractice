package com.practice.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
//@CheckPasswordMatchForStudent
public class StudentDTO {

	@NotEmpty(message = "Student`s firstName field can`t be null")
	@Size(min = 3, max = 15)
	private String firstName;
	
	@NotEmpty(message = "Student`s lastName field can`t be null")
	private String lastName;
	
	@Min(value = 0, message = "min>0")
	@Max(value = 120, message = "max<120")
	private int age;
	
	private String password;
	
	private String passwordConfirm;
}
