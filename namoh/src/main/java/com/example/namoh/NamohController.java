package com.example.namoh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamohController {
    @GetMapping("/namoh") String display(){
        return "namoh";
    }
}
