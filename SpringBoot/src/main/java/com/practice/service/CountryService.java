package com.practice.service;

import java.util.List;

import com.practice.entity.Country;

public interface CountryService {

	void saveCountry(Country country);
	
	List<Country> findAllCountry();
	
	Country findCountryById(int id);
}
