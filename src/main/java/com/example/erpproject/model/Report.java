package com.example.erpproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "reports")
public class Report {

    @Id
    private String id;

    private String userCode;
    private LocalDate dateOfReport;
    private String generatedBy; 
    private String uniqueCode;  
    private ReportType reportType;
    private boolean active = true;

   
    public enum ReportType {
        MENTOR, FACULTY, HOD, MANAGEMENT, INTERNSHIP
    }

    
    public Report() {}

    public Report(String userCode, LocalDate dateOfReport, String generatedBy, String uniqueCode, ReportType reportType) {
        this.userCode = userCode;
        this.dateOfReport = dateOfReport;
        this.generatedBy = generatedBy;
        this.uniqueCode = uniqueCode;
        this.reportType = reportType;
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

	public LocalDate getDateOfReport() {
		return dateOfReport;
	}

	public void setDateOfReport(LocalDate dateOfReport) {
		this.dateOfReport = dateOfReport;
	}

	public String getGeneratedBy() {
		return generatedBy;
	}

	public void setGeneratedBy(String generatedBy) {
		this.generatedBy = generatedBy;
	}

	public String getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public ReportType getReportType() {
		return reportType;
	}

	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

    
}
