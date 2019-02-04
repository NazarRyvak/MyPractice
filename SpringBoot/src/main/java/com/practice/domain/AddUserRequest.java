package com.practice.domain;

import javax.validation.constraints.NotEmpty;

import com.practice.validator.CheckIfUserEmailExist;
import com.practice.validator.CheckPasswordMatch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@CheckPasswordMatch //(message = "")
public class AddUserRequest {

	@NotEmpty private String login;
	@NotEmpty @CheckIfUserEmailExist private String email;
	@NotEmpty private String password;
	@NotEmpty private String passwordConfirm;

}