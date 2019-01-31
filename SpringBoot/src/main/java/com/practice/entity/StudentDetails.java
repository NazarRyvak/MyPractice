package com.practice.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student_details")
public class StudentDetails extends BaseEntity {
	
	private String email;
	

}
