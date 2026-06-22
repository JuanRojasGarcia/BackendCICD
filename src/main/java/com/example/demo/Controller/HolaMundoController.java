package com.example.demo.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public Map<String, Object> saludar() {
        return Map.of(
            "mensaje", "Hola Mundo JC CI/CD"
        );
    }

}
