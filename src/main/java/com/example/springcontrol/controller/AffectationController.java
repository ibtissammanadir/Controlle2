package com.example.springcontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AffectationController {

    @GetMapping("/affectation")
    public String affectation() {
        return "affectation";
    }
}
