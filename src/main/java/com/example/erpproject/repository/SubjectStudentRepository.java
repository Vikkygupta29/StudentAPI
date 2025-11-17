package com.example.erpproject.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.erpproject.model.SubjectStudent;

public interface SubjectStudentRepository extends MongoRepository<SubjectStudent, String>{
	List<SubjectStudent> findByUserCode(String userCode);


	Page<SubjectStudent> findAll(Pageable pageable);
}


