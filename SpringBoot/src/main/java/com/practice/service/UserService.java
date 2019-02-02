package com.practice.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.practice.domain.filter.FilterForUser;
import com.practice.entity.User;

public interface UserService {

	void saveUser(User user);
	
	User findUserById(int id);
	
	List<User> findAllUser();
	
	List<User> findUserByFilter(FilterForUser filter);
	
	Page<User> findUserByPage(Pageable pageable);
	
	Page<User> findUserByPageAndFilter(FilterForUser filter, Pageable pageable);
}
