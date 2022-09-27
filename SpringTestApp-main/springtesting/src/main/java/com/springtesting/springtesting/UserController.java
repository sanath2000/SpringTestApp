package com.springtesting.springtesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> list(){
        return userService.listAllUser();
    }

    @PostMapping("")
    public void add(@RequestBody User user){
        userService.saveUser(user);
    }
}
