package com.example.restservice11;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping
    User getUser(){
        return new User("jojo","bean");
    }
    @PostMapping
    UserPost postUser(@RequestBody User user){
        LocalDateTime localDate = LocalDateTime.now();
        UserPost userPost = new UserPost(user.getLogin(), localDate.toString());
        return userPost;
    }
}