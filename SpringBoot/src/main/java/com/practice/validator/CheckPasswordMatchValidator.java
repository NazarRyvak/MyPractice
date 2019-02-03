package com.practice.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.practice.domain.UserDTO;

@Component
public class CheckPasswordMatchValidator 
	implements ConstraintValidator<CheckPasswordMatch,UserDTO> {
	@Override
	public boolean isValid(UserDTO userDto, ConstraintValidatorContext arg1) {
		if(userDto.getPassword() == " " || userDto.getPasswordConfirm() == " ") {
			return false;
		}
		if(userDto.getPassword().equals(userDto.getPasswordConfirm())) {
			return true;
		}
		return false;
	}	
}