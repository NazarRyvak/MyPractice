package com.practice.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="uploadFile")
public class UploadFile extends BaseEntity{
	
	@Column(name="file_name")
	private String fileName;
	
	@Lob
	@Column(name="file_data" , columnDefinition="MEDIUMBLOB")
	@Basic(fetch= FetchType.LAZY)
	private byte[] fileData;

}
