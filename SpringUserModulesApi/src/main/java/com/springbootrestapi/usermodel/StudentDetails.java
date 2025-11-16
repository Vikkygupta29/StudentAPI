package com.springbootrestapi.usermodel;


public class StudentDetails {

    private String year;
    private String section;
    private String department;
    private String admissionCode;
    private int yearOfAdmission;
    private String course;
    private int passingOutYear;

 
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAdmissionCode() {
        return admissionCode;
    }
    public void setAdmissionCode(String admissionCode) {
        this.admissionCode = admissionCode;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }
    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public int getPassingOutYear() {
        return passingOutYear;
    }
    public void setPassingOutYear(int passingOutYear) {
        this.passingOutYear = passingOutYear;
    }
}

