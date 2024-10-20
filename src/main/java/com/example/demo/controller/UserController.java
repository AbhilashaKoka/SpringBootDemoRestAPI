package com.example.demo.controller;
import com.example.demo.bean.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @PostMapping("User")
    @ResponseStatus(HttpStatus.CREATED)
    public User CreateNewUser(@RequestBody  User user){
        System.out.println(user.getId());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        return user;
    }

}
