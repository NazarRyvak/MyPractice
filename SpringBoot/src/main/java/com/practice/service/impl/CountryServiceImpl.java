package com.practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Country;
import com.practice.repository.CountryRepository;
import com.practice.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public void saveCountry(Country country) {
		countryRepository.save(country);

	}

	@Override
	public List<Country> findAllCountry() {

		return countryRepository.findAll();
	}

	@Override
	public Country findCountryById(int id) {

		return countryRepository.getOne(id);
	}

}
