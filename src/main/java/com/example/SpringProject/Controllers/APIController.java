package com.example.SpringProject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
    private int num;

    @PostMapping("/sendToSvr")
    public void sendToSvr(){
        num = (int) (Math.random() * 100);
    }

    @GetMapping("/returnFromSvr")
    public int returnFromSvr(){
        return num;
    }
}
