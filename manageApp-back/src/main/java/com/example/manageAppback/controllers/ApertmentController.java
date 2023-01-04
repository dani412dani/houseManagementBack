package com.example.manageAppback.controllers;

import com.example.manageAppback.models.Apertment;
import com.example.manageAppback.models.Event;
import com.example.manageAppback.services.ApertmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apertments")
@CrossOrigin
public class ApertmentController {
    @Autowired
    private ApertmentService apertmentService;

    @GetMapping("")
    public List<Apertment> getAll() {
        return this.apertmentService.getAll();
    }

    @GetMapping("/user/{userId}")
    public List<Apertment> getAllByUserId(@PathVariable Integer userId) {
        return this.apertmentService.getAllByUserId(userId);
    }

    @GetMapping("/{id}")
    public Apertment getById(@PathVariable Integer id) {
        return this.apertmentService.getById(id);
    }

    @PostMapping("")
    public void addApertment(@RequestBody Apertment newApertment) {
        this.apertmentService.addApertment(newApertment);
    }

    @DeleteMapping("/{id}")
    public void deleteApertment(@PathVariable Integer id) {
        this.apertmentService.deleteApertment(id);
    }
}
