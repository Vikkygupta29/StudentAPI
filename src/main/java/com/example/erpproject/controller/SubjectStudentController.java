package com.example.erpproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.erpproject.model.SubjectStudent;
import com.example.erpproject.service.SubjectStudentService;

@RestController
@RequestMapping("/api/subject-students")
public class SubjectStudentController{
	
	@Autowired
	private SubjectStudentService subjectStudentService;
	
	@GetMapping("/page")
	public Page<SubjectStudent> getPaginated(
			@RequestParam(defaultValue= "0") int page,
			@RequestParam(defaultValue= "5") int size){
		Pageable pageable = PageRequest.of(page,  size);
		return subjectStudentService.getAllPaginated(pageable);
	}
	
	
	@PostMapping
	public SubjectStudent create(@RequestBody SubjectStudent subjectStudent) {
		return subjectStudentService.create(subjectStudent);
	}
	@GetMapping
	public List<SubjectStudent>getAll(){
		return subjectStudentService.getAll();
	}
	@GetMapping("/student/{studentCode}")
	public List<SubjectStudent>getByUserCode(@PathVariable String studentCode){
		return subjectStudentService.getByUserCode(studentCode);
		}
	@PutMapping("/{id}")
	public SubjectStudent update(@PathVariable String id, @RequestBody SubjectStudent updated) {
		return subjectStudentService.update(id, updated);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		subjectStudentService.delete(id);
	}

	
	
	
	
}