package com.practice.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.repository.UserRepository;

@Component
public class CheckIfUserEmailExistValidator implements ConstraintValidator<CheckIfUserEmailExist, String> {

	@Autowired private UserRepository userRepository;
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(userRepository.findUserByEmail(value.toLowerCase())==null) {
			return true;
		}
		return false;
	}

}
