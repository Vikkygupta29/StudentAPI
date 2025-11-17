package com.example.erpproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.erpproject.model.SubjectStudent;
import com.example.erpproject.repository.SubjectStudentRepository;

@Service
public class SubjectStudentService{
	@Autowired
	private SubjectStudentRepository subjectStudentRepository;
	
	public Page<SubjectStudent> getAllPaginated(Pageable pageable){
		return subjectStudentRepository.findAll(pageable);
	}
	
	public SubjectStudent create(SubjectStudent subjectStudent) {
		return subjectStudentRepository.save(subjectStudent);
	}
	public List<SubjectStudent> getAll(){
		return subjectStudentRepository.findAll();
	}
	public List<SubjectStudent>getByUserCode(String userCode){
		return subjectStudentRepository.findByUserCode(userCode);
	}
	public Optional<SubjectStudent> getById(String id){
		return subjectStudentRepository.findById(id);
	}
	public SubjectStudent update (String id, SubjectStudent updated) {
		Optional<SubjectStudent> existing= subjectStudentRepository.findById(id);
	  if(existing.isPresent()) {
		  SubjectStudent s= existing.get();
		  s.setName(updated.getName());
		  s.setYear(updated.getYear());
		  s.setSemester(updated.getSemester());
		  s.setAssessments(updated.getAssessments());
		  s.setActive(updated.isActive());
		  return subjectStudentRepository.save(s);
		  
	  }return null;          //  yaa to ye : throw new RuntimeException("Student Not Found");
	}
	
	public void delete (String id) {
		Optional<SubjectStudent> s=subjectStudentRepository.findById(id);
		if(s.isPresent()) {
			SubjectStudent sub = s.get();
			sub.setActive(false);
			subjectStudentRepository.save(sub);
		}
	}
	
	
	
	
	
}
