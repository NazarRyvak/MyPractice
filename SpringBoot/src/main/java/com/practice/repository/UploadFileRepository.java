package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.UploadFile;
@Repository
public interface UploadFileRepository extends JpaRepository<UploadFile, Integer>{

}
