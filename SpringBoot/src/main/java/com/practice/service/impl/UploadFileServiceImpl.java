package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.UploadFile;
import com.practice.repository.UploadFileRepository;
import com.practice.service.UploadFileService;
@Service
public class UploadFileServiceImpl implements UploadFileService {

	@Autowired private UploadFileRepository uploadFileRepository;
	@Override
	public void save(UploadFile file) {

		uploadFileRepository.save(file);
	}

	@Override
	public UploadFile fileOneById(int id) {
		
		return uploadFileRepository.getOne(id);
	}

}
