package com.practice.service;

import com.practice.entity.UploadFile;

public interface UploadFileService {

	void save(UploadFile file);
	
	UploadFile fileOneById(int id);
}
