package com.example.aps.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser(){
        return  userService.getUsers();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user) {
        this.userService.addNewUsers(user);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(@PathVariable("userId") Long userId, @RequestParam String name, @RequestParam String email) {
        this.userService.updateUser(userId, name, email);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteuSER(@PathVariable("userId") Long userId) {
        this.userService.deleteUser(userId);
    }



}
