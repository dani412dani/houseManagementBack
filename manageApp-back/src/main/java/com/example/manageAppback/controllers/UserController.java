package com.example.manageAppback.controllers;

import com.example.manageAppback.models.User;
import com.example.manageAppback.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/{email}")
    public User getByEmail(@PathVariable String email) {
        return this.userService.getByEmail(email);
    }

    @GetMapping("/login")
    @ResponseBody
    public User getByLogin(@RequestParam String email, @RequestParam String password) throws Exception {
        return this.userService.getByLogin(email, password);
    }

    @PostMapping("")
    public void addUser(@RequestBody User newUser) {
        this.userService.addUser(newUser);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Integer id) {
        this.userService.deleteEvent(id);
    }
}
