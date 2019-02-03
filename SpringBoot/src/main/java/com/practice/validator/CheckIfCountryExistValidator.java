package com.practice.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.repository.CountryRepository;

@Component
public class CheckIfCountryExistValidator implements ConstraintValidator<CheckIfCountryExist, String> {

	@Autowired private CountryRepository countryRepository;
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(countryRepository.findCountryByName(value.toLowerCase())==null) {
			return true;
		}
		return false;
	}

}