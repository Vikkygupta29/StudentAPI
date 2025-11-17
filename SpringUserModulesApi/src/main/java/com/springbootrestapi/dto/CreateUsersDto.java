package com.springbootrestapi.dto;

import com.springbootrestapi.usermodel.Role;
import com.springbootrestapi.usermodel.StudentDetails;

public class CreateUsersDto {

    private  String name;
    private String email;
    private Role role;


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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public CreateUsersDto(String name, String email, Role role) {
        this.name = name;
        this.email = email;
        this.role = role;

    }
}
