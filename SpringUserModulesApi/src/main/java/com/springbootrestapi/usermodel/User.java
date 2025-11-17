package com.springbootrestapi.usermodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class User {

	@Id
	private String id;
    private String name;
    private String email;
    @Indexed(unique = true)
    private String userCode;
    private boolean active = true;
	private Role role;
    private StudentDetails studentDetails;
    
    public User() {
        
    }

    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	public User(String id, String name, String email, String userCode, boolean active, Role role,
			StudentDetails studentDetails) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.userCode = userCode;
		this.active = active;
		this.role = role;
		this.studentDetails = studentDetails;
	}
	
    
    
}
