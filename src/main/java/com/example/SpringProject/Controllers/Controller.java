package com.example.SpringProject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String GetIndex(){
        return "index";
    }
}
