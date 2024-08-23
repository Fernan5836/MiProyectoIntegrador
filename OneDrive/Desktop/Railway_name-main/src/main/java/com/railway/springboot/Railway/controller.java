package com.railway.springboot.Railway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/miNombre")
    public String miNombre() {
        return "Angel David Coyoy Recancoj";  // Nombre
    }
}