package com.practice.domain.filter;

import lombok.Data;

@Data
public class FilterForUser {

	private String searchByFirstName;

	private String searchByLastName;

	private String searchByEmail;

	private String searchByLogin;
	
	private int age;

	private String searchFromMinAge;

	private String searchToMaxAge;
}
