package com.dd.solution.auth2.controller;

import com.dd.solution.auth2.dto.UserDTO;
import com.dd.solution.auth2.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(produces = "application/json")
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO){
        log.info("user request: {}", userDTO);
        final UserDTO userAdded = userService.addUser(userDTO);
        return new ResponseEntity<>(userAdded, HttpStatus.OK);
    }

    @PutMapping(produces = "application/json")
    public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO){
        final UserDTO userUpdated = userService.updateUser(userDTO);
        return new ResponseEntity<>(userUpdated, HttpStatus.OK);
    }
}
