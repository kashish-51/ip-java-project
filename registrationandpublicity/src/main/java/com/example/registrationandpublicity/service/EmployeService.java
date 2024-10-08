package com.example.registrationandpublicity.service;

import com.example.registrationandpublicity.entity.Employe;

import java.util.List;
import java.util.Optional;

public interface EmployeService {
    List<Employe> findAllEmploye();
    Optional<Employe> findById(Long id);  // Changed return type to Optional<Employe>
    Employe saveEmploye(Employe employeEntity);
    Employe updateEmploye(Employe employeEntity);
    void deleteEmploye(Long id);
}
