package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.SizeOfPage;
import com.practice.repository.SizeOfPageRepository;
import com.practice.service.SizeOfPageService;


@Service
public class SizeOfPageServiceImpl implements SizeOfPageService {

	@Autowired private SizeOfPageRepository repository;
	@Override
	public SizeOfPage findById(int id) {
		return repository.getOne(id);
	}
	@Override
	public void savePage(SizeOfPage sizeOfPage) {
		 repository.save(sizeOfPage);
		
	}

}
