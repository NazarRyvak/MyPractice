package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="image_of_user")
public class ImageOfUser extends BaseEntity {

	@Column(name="user_id")
	private int userId;
	
	@Column(name="image_name")
	private String imageName;
}
