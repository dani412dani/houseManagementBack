package com.example.manageAppback.services;

import com.example.manageAppback.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.manageAppback.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    public User getByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public void addUser(User newUser) {
        this.userRepository.save(newUser);
    }

    public void deleteEvent(Integer id) {
        this.userRepository.deleteById(id);
    }

    public User getByLogin(String email, String password) throws Exception {
        User user = this.userRepository.findByEmail(email);
        if (user.getPassword().equals(password)) {
            return user;
        } else {
            throw new Exception();
        }
    }
}
