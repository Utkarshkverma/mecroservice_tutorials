package com.vermau2k01.user_service.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermau2k01.user_service.entities.User;
import com.vermau2k01.user_service.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserServices userServices;
    
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User user1 = userServices.saveUser(user);

        return new ResponseEntity<>(user1,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser()
    {
        return new ResponseEntity<>(userServices.getAllUser(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String id)
    {
        User user1 = userServices.findUserById(id);
        return new ResponseEntity<>(user1,HttpStatus.FOUND);
    }
}
