package com.example.manageAppback.repositories;

import com.example.manageAppback.models.Apertment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApertmentRepository extends JpaRepository<Apertment, Integer> {
    List<Apertment> findByUserId_Id(Integer userId);
}
