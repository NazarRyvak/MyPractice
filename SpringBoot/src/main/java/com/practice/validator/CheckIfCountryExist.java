package com.practice.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy=CheckIfCountryExistValidator.class)
public @interface CheckIfCountryExist {

	String message() default "Country already exists";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
