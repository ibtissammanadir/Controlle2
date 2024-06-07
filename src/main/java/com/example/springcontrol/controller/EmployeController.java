package com.example.springcontrol.controller;

import com.example.springcontrol.Model.EmployeEntityManager;
import com.example.springcontrol.Model.EmployeEntityManager;
import com.example.springcontrol.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @GetMapping("/employes")
    public String listEmployes(Model model) {
        List<EmployeEntityManager> employes = employeService.findAll();
        model.addAttribute("employes", employes);
        return "employes";
    }
}
