package com.springbootrestapi.userController;



import com.springbootrestapi.dto.CreateUsersDto;
import com.springbootrestapi.dto.InternStudentsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springbootrestapi.userService.UserService;
import com.springbootrestapi.usermodel.InternshipStudent;
import com.springbootrestapi.usermodel.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	 @Autowired
	 private UserService  userService;
	
	  @PostMapping("/create")
      public ResponseEntity<User> getUser(@RequestBody CreateUsersDto createUsersDto) {
		  try {
    	  User newuser =  userService.createUser(createUsersDto);
    	   return new ResponseEntity<>(newuser,HttpStatus.CREATED);
		  }catch(Exception e) {
			  return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		  }
      }


	  
	  @GetMapping("/all")
	  public ResponseEntity<Page<User>> getAllUsers(@RequestParam(defaultValue = "0")int page , @RequestParam(defaultValue = "2")int size) {
	      Page<User> users = userService.getAllUsers(page,size);
	      if (!users.isEmpty()) {
	          return new ResponseEntity<>(users, HttpStatus.OK);
	      } else {
	          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	      }
	  }




    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        User user = userService.updateUser(id, updatedUser);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



    // for internStudent
	  
	  //create
	  @PostMapping("/createInternStudent")
	  public InternshipStudent createStudent(@RequestBody InternStudentsDto internStudentsDto) {
		  return userService.createInternStudents(internStudentsDto);
	  }

    // Read
    @GetMapping("/allInternStudents")
    public Page<InternshipStudent> getAllInternStudentsList(@RequestParam(defaultValue = "0") int page , @RequestParam (defaultValue = "5") int size) {
        Pageable pagable = PageRequest.of(page,size);
        return userService.showAll(pagable);
    }



}
