package com.springbootrestapi.dto;

import com.springbootrestapi.usermodel.InternStudentsDetails;

public class InternStudentsDto {

    private String name;
    private String email;
    private InternStudentsDetails details;

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

    public InternStudentsDetails getDetails() {
        return details;
    }

    public void setDetails(InternStudentsDetails details) {
        this.details = details;
    }

    public InternStudentsDto(String name, String email, InternStudentsDetails details) {
        this.name = name;
        this.email = email;
        this.details = details;
    }
}
