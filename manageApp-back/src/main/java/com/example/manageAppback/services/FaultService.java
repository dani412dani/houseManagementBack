package com.example.manageAppback.services;

import com.example.manageAppback.models.Apertment;
import com.example.manageAppback.models.Event;
import com.example.manageAppback.models.Fault;
import com.example.manageAppback.models.User;
import com.example.manageAppback.repositories.FaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaultService {
    @Autowired
    private FaultRepository faultRepository;

    public List<Fault> getAll() {
        return this.faultRepository.findAll();
    }

    public List<Fault> getAllByUserId(Integer userId) {
        return this.faultRepository.findByApertmentId_UserId_Id(userId);
    }

    public Fault getById(Integer id) {
        return this.faultRepository.findById(id).get();
    }

    public void addFault(Fault newFault) {
        this.faultRepository.save(newFault);
    }

    public void deleteFault(Integer id) {
        this.faultRepository.deleteById(id);
    }

    public void deleteFaultByApertmentId(Integer apertnemtId) {
        this.faultRepository.deleteByApertmentId_ApertmentId(apertnemtId);
    }

    public void fixedFualt(Integer id) {
        Fault fault = this.getById(id);
        fault.changeFixed(true);
        this.faultRepository.save(fault);
    }

    public void restoreFault(Integer id) {
        Fault fault = this.getById(id);
        fault.changeFixed(false);
        this.faultRepository.save(fault);
    }

    public void changeContent(Integer id, String newContent) {
        Fault fault = this.getById(id);
        fault.setContent(newContent);
        this.faultRepository.save(fault);
    }

    public List<Fault> getAllByApertmentId(Integer apertmentId) {
        return this.faultRepository.findByApertmentId_ApertmentId(apertmentId);
    }
}
