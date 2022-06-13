package com.bridgelabz.userregistrationapp.controller;

import com.bridgelabz.userregistrationapp.dto.ResponseDTO;
import com.bridgelabz.userregistrationapp.entity.User;
import com.bridgelabz.userregistrationapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add-user")
    public ResponseEntity<ResponseDTO> addUser(@RequestBody User user){
        User user1 = null;
        user1 = userService.addUser(user);
        ResponseDTO responseDTO = new ResponseDTO("User Registered Successfully", user1);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.CREATED);
    }
}
