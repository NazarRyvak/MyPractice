package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class SizeOfPage extends BaseEntity {
	
	@Column(name="size_page")
	private String sizePage;

}
