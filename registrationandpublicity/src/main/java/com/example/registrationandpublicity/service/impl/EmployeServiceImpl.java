package com.example.registrationandpublicity.service.impl;

import com.example.registrationandpublicity.entity.Employe;
import com.example.registrationandpublicity.repository.EmployeRepository;  // Assuming this exists
import com.example.registrationandpublicity.service.EmployeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService {

    private final EmployeRepository employeRepository;

    public EmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public List<Employe> findAllEmploye() {
        return employeRepository.findAll();  // Return list of all employees
    }

    @Override
    public Optional<Employe> findById(Long id) {  // Return Optional<Employe>
        return employeRepository.findById(id);
    }

    @Override
    public Employe saveEmploye(Employe employeEntity) {
        return employeRepository.save(employeEntity);  // Save employee
    }

    @Override
    public Employe updateEmploye(Employe employeEntity) {
        return employeRepository.save(employeEntity);  // Update employee
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);  // Delete employee by ID
    }
}
