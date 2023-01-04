package com.example.manageAppback.controllers;

import com.example.manageAppback.models.Apertment;
import com.example.manageAppback.models.Event;
import com.example.manageAppback.models.Fault;
import com.example.manageAppback.services.FaultService;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faults")
@CrossOrigin
public class FaultController {
    @Autowired
    private FaultService faultService;

    @GetMapping("")
    public List<Fault> getAll() {
        return this.faultService.getAll();
    }

    @GetMapping("/user/{userId}")
    public List<Fault> getAllByUserId(@PathVariable Integer userId) {
        return this.faultService.getAllByUserId(userId);
    }

    @GetMapping("/apertment/{apertmentId}")
    public List<Fault> getAllByApertmentId(@PathVariable Integer apertmentId) {
        return this.faultService.getAllByApertmentId(apertmentId);
    }

    @GetMapping("/{id}")
    public Fault getById(@PathVariable Integer id) {
        return this.faultService.getById(id);
    }

    @PostMapping("")
    public void addFault(@RequestBody Fault newFault) {
        this.faultService.addFault(newFault);
    }

    @DeleteMapping("/{id}")
    public void deleteFault(@PathVariable Integer id) {
        this.faultService.deleteFault(id);
    }

    @PutMapping("/fixed/{id}")
    public void fixedFault(@PathVariable Integer id) {
        this.faultService.fixedFualt(id);
    }

    @PutMapping("/restoreFault/{id}")
    public void restoreFault(@PathVariable Integer id) {
        this.faultService.restoreFault(id);
    }

    @PutMapping("/changeContent/{id}")
    public void changeContent(@PathVariable Integer id, @RequestBody String newFault) {
        this.faultService.changeContent(id, newFault);
    }
}
