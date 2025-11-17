package com.springbootrestapi.userService;


import java.util.Optional;

import com.springbootrestapi.dto.CreateUsersDto;
import com.springbootrestapi.dto.InternStudentsDto;
import com.springbootrestapi.usermodel.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springbootrestapi.repository.InternshipStudentRepository;
import com.springbootrestapi.repository.UserRepository;

@Service
public class UserService {

    @Autowired    // Dependency Injection
    private UserRepository userrepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private InternshipStudentRepository internStudentRepo;

    //for Users

    //create
    public User createUser(CreateUsersDto createUsersDto) {
        User user = new User();
        user.setName(createUsersDto.getName());
        user.setEmail(createUsersDto.getEmail());
        user.setRole(createUsersDto.getRole());
        user.setUserCode(UniqueCodegenerator.generateCode("USR-"));
        if (createUsersDto.getRole() != Role.Student) {
            user.setStudentDetails(null);
        }
        return userrepository.save(user);
    }

    //read
    public Page<User> getAllUsers(int page ,int size) {
        Pageable p = PageRequest.of(page,size);
        return userrepository.findByActiveTrue(p);

    }


    //update
    public User updateUser(String id, User updatedUser) {
        Optional<User> userOptional = userrepository.findById(id);

        if (userOptional.isPresent()) {
            User existingUser = userOptional.get();

            existingUser.setActive(updatedUser.isActive());

            return userrepository.save(existingUser);
        }

        return null;
    }


    // for InternStudents

    //create
    public InternshipStudent createInternStudents(InternStudentsDto dto) {
        InternshipStudent internshipStudent = modelMapper.map(dto, InternshipStudent.class);
        internshipStudent.setStudentId(UniqueCodegenerator.generateCode("STU-"));
        InternStudentsDetails internStudents = modelMapper.map(dto.getDetails(), InternStudentsDetails.class);
        internshipStudent.setInternStudentsDetails(internStudents);
        return internStudentRepo.save(internshipStudent);
    }

    // showAll
    public Page<InternshipStudent> showAll(Pageable pageable) {
        return internStudentRepo.findAll(pageable);
    }



}