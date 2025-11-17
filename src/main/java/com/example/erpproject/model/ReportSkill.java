package com.example.erpproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "report-skills")
public class ReportSkill {

    @Id
    private String id;

    private String reportUniqueCode; 
    private String skillName;
    private double rating;
    private double outOfRating;
    private boolean active = true;

    public ReportSkill() {}

    public ReportSkill(String reportUniqueCode, String skillName, double rating, double outOfRating) {
        this.reportUniqueCode = reportUniqueCode;
        this.skillName = skillName;
        this.rating = rating;
        this.outOfRating = outOfRating;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReportUniqueCode() {
		return reportUniqueCode;
	}

	public void setReportUniqueCode(String reportUniqueCode) {
		this.reportUniqueCode = reportUniqueCode;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getOutOfRating() {
		return outOfRating;
	}

	public void setOutOfRating(double outOfRating) {
		this.outOfRating = outOfRating;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

   
}



