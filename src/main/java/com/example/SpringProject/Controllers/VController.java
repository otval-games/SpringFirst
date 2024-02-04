package com.example.SpringProject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class VController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}