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

import com.logos.domain.filter.FilterForUser;
import com.practice.entity.User;
import com.practice.repository.UserRepository;
import com.practice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);

	}

	@Override
	public User findUserById(int id) {
		return userRepository.getOne(id);
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public List<User> findUserByFilter(FilterForUser filter) {
		return userRepository.findAll(getSpecification(filter));
	}
	

	private Specification<User> getSpecification(FilterForUser filter) {
		return new Specification<User>() {

			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

				Predicate firstName = null;
				Predicate lastName = null;
				Predicate email = null;
				Predicate login = null;
				Predicate age = null;
				int min = 0;
				int max = 80;

				if (!filter.getSearchByFirstName().equals(null)) {
					firstName = criteriaBuilder.like(root.get("firstName"), "%" + filter.getSearchByFirstName() + "%");
				}
				if (!filter.getSearchByLastName().equals(null)) {
					lastName = criteriaBuilder.like(root.get("lastName"), "%" + filter.getSearchByLastName() + "%");
				}
				if (!filter.getSearchByEmail().equals(null)) {
					email = criteriaBuilder.like(root.get("email"), "%" + filter.getSearchByEmail() + "%");
				}
				if (!filter.getSearchByLogin().equals(null)) {
					login = criteriaBuilder.like(root.get("login"), "%" + filter.getSearchByLogin() + "%");
				}
				query.orderBy(criteriaBuilder.asc(root.get("age")));
				if (!filter.getSearchFromMinAge().equals("") && !filter.getSearchToMaxAge().equals("")) {
					min = Integer.parseInt(filter.getSearchFromMinAge());
					max = Integer.parseInt(filter.getSearchToMaxAge());
				} else if (filter.getSearchFromMinAge().equals("") && !filter.getSearchToMaxAge().equals("")) {
					min = 0;
					max = Integer.parseInt(filter.getSearchToMaxAge());
				} else if (filter.getSearchToMaxAge().equals("") && !filter.getSearchFromMinAge().equals("")) {
					min = Integer.parseInt(filter.getSearchFromMinAge());
					max = 80;
				}
				System.out.println("Min" + min);
				System.out.println("Max" + max);
				age = criteriaBuilder.between(root.get("age"), min, max);
				query.orderBy(criteriaBuilder.asc(root.get("id")));

				return criteriaBuilder.and(firstName, lastName, email, login, age);
			}

		};
	}

	@Override
	public Page<User> findUserByPage(Pageable pageable) {
		return userRepository.findAll(PageRequest.of(pageable.getPageNumber(), pageable.getPageSize()));
	}
	@Override
	public Page<User> findUserByPageAndFilter(FilterForUser filter, Pageable pageable) {
		
		return userRepository.findAll(getSpecification(filter), pageable);
	}

}
