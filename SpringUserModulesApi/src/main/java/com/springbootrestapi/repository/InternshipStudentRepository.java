package com.springbootrestapi.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springbootrestapi.usermodel.InternshipStudent;


@Repository
public interface InternshipStudentRepository extends MongoRepository<InternshipStudent, String> {

}
