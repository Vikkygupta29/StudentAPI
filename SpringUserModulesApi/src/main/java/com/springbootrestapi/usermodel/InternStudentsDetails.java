package com.springbootrestapi.usermodel;

public class InternStudentsDetails {

    private String contactNumber;
    private String department;
    private String collegeName;
    private String internshipTitle;
    private String companyName;
    private String startDate;
    private String endDate;
    private Status status;
    private double stipend;

    public InternStudentsDetails(){

    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getInternshipTitle() {
        return internshipTitle;
    }

    public void setInternshipTitle(String internshipTitle) {
        this.internshipTitle = internshipTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }

    public InternStudentsDetails(String contactNumber, String department, String collegeName, String internshipTitle, String companyName, String startDate, String endDate, Status status, double stipend) {
        this.contactNumber = contactNumber;
        this.department = department;
        this.collegeName = collegeName;
        this.internshipTitle = internshipTitle;
        this.companyName = companyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.stipend = stipend;
    }
}
