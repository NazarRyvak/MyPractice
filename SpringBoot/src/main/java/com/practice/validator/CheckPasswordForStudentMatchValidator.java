package com.practice.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.practice.domain.StudentDTO;

@Component
public class CheckPasswordForStudentMatchValidator implements ConstraintValidator<CheckPasswordMatchForStudent, StudentDTO> {

	@Override
	public boolean isValid(StudentDTO value, ConstraintValidatorContext context) {
		if(value.getPassword() == " " || value.getPasswordConfirm() == " ") {
			return false;
		}
		if(value.getPassword().equals(value.getPasswordConfirm())) {
			return true;
		}
		return false;
	}

}
