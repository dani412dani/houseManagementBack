package com.example.manageAppback.repositories;

import com.example.manageAppback.models.Fault;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaultRepository extends JpaRepository<Fault, Integer> {
    List<Fault> findByApertmentId_UserId_Id(Integer userId);

    List<Fault> findByApertmentId_ApertmentId(Integer apertmentId);

    void deleteByApertmentId_ApertmentId(Integer apertnemtId);
}
