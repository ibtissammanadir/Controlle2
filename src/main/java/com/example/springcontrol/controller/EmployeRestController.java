package com.example.springcontrol.controller;

import com.example.springcontrol.Model.EmployeEntityManager;
import com.example.springcontrol.request.Employe;
import com.example.springcontrol.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
public class EmployeRestController {

    @Autowired
    private EmployeService employeService;

    @GetMapping
    public List<EmployeEntityManager> getAllEmployes() {
        return employeService.findAll();
    }

    @GetMapping("/{id}")
    public EmployeEntityManager getEmployeById(@PathVariable Long id) {
        return employeService.findById(id);
    }

    @PostMapping
    public EmployeEntityManager createEmploye(@RequestBody EmployeEntityManager employe) {
        return employeService.save(employe);
    }

    @PutMapping("/{id}")
    public EmployeEntityManager updateEmploye(@PathVariable Long id, @RequestBody Employe employeDetails) {
        EmployeEntityManager employe = employeService.findById(id);
        employe.setName(employeDetails.getName());
        employe.setEmail(employeDetails.getEmail());
        employe.setProjects(employeDetails.getProjects());
        return employeService.save(employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.delete(id);
    }
}
