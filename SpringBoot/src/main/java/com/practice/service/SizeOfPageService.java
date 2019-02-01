package com.practice.service;

import com.practice.entity.SizeOfPage;




public interface SizeOfPageService {
	SizeOfPage findById(int id);
	void savePage(SizeOfPage sizeOfPage);
	
}
