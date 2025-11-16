package com.springbootrestapi.usermodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="internStudents")
public class InternshipStudent {

	    @Id
	    private String studentId;
	    private String name;
	    private String email;
        @Field("details")
	    private InternStudentsDetails internStudentsDetails;

    public InternshipStudent() {

    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InternStudentsDetails getInternStudentsDetails() {
        return internStudentsDetails;
    }

    public void setInternStudentsDetails(InternStudentsDetails internStudentsDetails) {
        this.internStudentsDetails = internStudentsDetails;
    }

    public InternshipStudent(String studentId, String name, String email, InternStudentsDetails internStudentsDetails) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.internStudentsDetails = internStudentsDetails;
    }
}
