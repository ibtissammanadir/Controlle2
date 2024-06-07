package com.example.springcontrol.service;

import com.example.springcontrol.Model.EmployeEntityManager;
import com.example.springcontrol.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {

    @Autowired
    private EmployeeRepository employeRepository;

    public List<EmployeEntityManager> findAll() {
        return employeRepository.findAll();
    }

    public EmployeEntityManager findById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    public EmployeEntityManager save(EmployeEntityManager employe) {
        return employeRepository.save(employe);
    }

    public void delete(Long id) {
        employeRepository.deleteById(id);
    }
}
