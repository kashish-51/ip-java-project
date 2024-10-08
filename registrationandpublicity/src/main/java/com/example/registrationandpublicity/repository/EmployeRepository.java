package com.example.registrationandpublicity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.registrationandpublicity.entity.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe,Long> {
    
}