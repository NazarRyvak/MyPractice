package com.practice.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.practice.domain.filter.SimpleFilter;
import com.practice.entity.Student;

public interface StudentService {

	void saveStudent(Student student);
	
	List<Student> findAllStudent();
	
	Student findStudentById(int id);
	
	List<Student> findStudentsByFilter(SimpleFilter filter);
	
	Page<Student> findStudentByPage(Pageable pageable);
	

}
