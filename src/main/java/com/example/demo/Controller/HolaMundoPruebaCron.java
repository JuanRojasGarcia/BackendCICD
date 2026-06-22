package com.example.demo.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoPruebaCron {

    @GetMapping("/holaCron")
    public Map<String, Object> saludar() {
        return Map.of(
            "Juan", "Hola Cron Prueba"
        );
    }

}
