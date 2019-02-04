package com.practice.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.practice.validator.CheckIfUserEmailExist;
import com.practice.validator.CheckIfUserLoginExist;
import com.practice.validator.CheckPasswordMatch;

import lombok.Data;

@Data
@CheckPasswordMatch
public class UserDTO {

	@NotEmpty(message="The field firstName can`t be empty")
	private String firstName;
	
	@NotEmpty(message="The field lastName can`t be empty")
	private String lastName;
	
	@Min(value = 0, message = "min>0")
	@Max(value = 120, message = "max<120")
	private int age;
	
	@Email
	@CheckIfUserEmailExist
	@NotEmpty(message="The field email can`t be empty")
	private String email;
	
	@CheckIfUserLoginExist
	@NotEmpty(message="The field login can`t be empty")
	private String login;
	
	private String password;
	
	private String passwordConfirm;
}
