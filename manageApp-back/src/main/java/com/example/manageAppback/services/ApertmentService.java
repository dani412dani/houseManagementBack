package com.example.manageAppback.services;

import com.example.manageAppback.models.Apertment;
import com.example.manageAppback.models.Event;
import com.example.manageAppback.repositories.ApertmentRepository;
import com.example.manageAppback.repositories.FaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApertmentService {
    @Autowired
    private ApertmentRepository apertmentRepository;
//    private FaultRepository faultRepository;

    public List<Apertment> getAll() {
        return this.apertmentRepository.findAll();
    }

    public List<Apertment> getAllByUserId(Integer userId) {
        return this.apertmentRepository.findByUserId_Id(userId);
    }

    public Apertment getById(Integer id) {
        return this.apertmentRepository.findById(id).get();
    }

    public void addApertment(Apertment newApertment) {
        this.apertmentRepository.save(newApertment);
    }
    public void deleteApertment(Integer id) {
        this.apertmentRepository.deleteById(id);

    }
//    public void deleteApertment(Integer id) {
//        try{
////            this.faultRepository.deleteByApertmentId_ApertmentId(id);
//            this.apertmentRepository.deleteById(id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
