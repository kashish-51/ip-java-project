package com.example.registrationandpublicity.controller;

import com.example.registrationandpublicity.entity.Employe;
import com.example.registrationandpublicity.service.EmployeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employe")
public class EmployeController {

    private final EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @GetMapping
    public List<Employe> findAllEmploye() {
        return employeService.findAllEmploye();
    }

    @GetMapping("/{id}")
    public Optional<Employe> findEmployeById(@PathVariable("id") Long id) {
        return employeService.findById(id);
    }

    @PostMapping
    public Employe saveEmploye(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }

    @PutMapping("/{id}")
    public Employe updateEmploye(@PathVariable("id") Long id, @RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @DeleteMapping("/{id}")
    public void  deleteEmploye(@PathVariable("id") Long id) {
        employeService.deleteEmploye(id);
    }
}
