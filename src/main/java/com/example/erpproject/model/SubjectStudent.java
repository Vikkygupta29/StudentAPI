package com.example.erpproject.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "subject_students")
public class SubjectStudent{
	@Id
	private String id;
	private String userCode;
 
	@Indexed(unique=true)
	private String code;
	private  String name;
	private String year;
	private String semester;
	private List<Assessment>assessments;
	private boolean active = true;
	
	public SubjectStudent() {
		this.code= UUID.randomUUID().toString();
		
	}
	
	
	public static class Assessment{
		private String type;
		private double fullMarks;
		private double marksObtained;
		private String gradeObtained;
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getFullMarks() {
			return fullMarks;
		}
		public void setFullMarks(double fullMarks) {
			this.fullMarks = fullMarks;
		}
		public double getMarksObtained() {
			return marksObtained;
		}
		public void setMarksObtained(double marksObtained) {
			this.marksObtained = marksObtained;
		}
		public String getGradeObtained() {
			return gradeObtained;
		}
		public void setGradeObtained(String gradeObtained) {
			this.gradeObtained = gradeObtained;
		}
			
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}


	public List<Assessment> getAssessments() {
		return assessments;
	}


	public void setAssessments(List<Assessment> assessments) {
		this.assessments = assessments;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
		
	
	
	
}