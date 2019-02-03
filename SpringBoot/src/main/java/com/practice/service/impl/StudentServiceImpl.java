package com.practice.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.practice.domain.filter.SimpleFilter;
import com.practice.entity.Student;
import com.practice.exception.StudentNotFoundException;
import com.practice.repository.StudentRepository;
import com.practice.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveStudent(Student student) {

		studentRepository.save(student);

	}

	@Override
	public List<Student> findAllStudent() {

		return studentRepository.findAll();
	}

	@Override
	public Student findStudentById(int id) {
		//Optional<Student>optional = studentRepository.findById(id);
		return studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException("Student with id["+id+"] not found"));
	}

    @Override
	public List<Student> findStudentsByFilter(SimpleFilter filter) {
		return studentRepository.findAll(getSpecification(filter));
	}
	
	private Specification<Student> getSpecification(SimpleFilter filter){
		
		return new Specification<Student>() {

			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				if(filter.getSearch().isEmpty()) {
					return null;
				}
				return criteriaBuilder.like(root.get("firstName"),"%"+filter.getSearch()+"%" );
			}
		};
	}
	@Override
	public Page<Student> findStudentByPage(Pageable pageable) {
		//PageRequest pageRequest = new PageRequest(page, size);
		
		return studentRepository.findAll(PageRequest.of(pageable.getPageNumber(), pageable.getPageSize()));
	}

}
