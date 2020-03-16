package com.DigitalInovation.ConceitosSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String msgBoasVindas(){

        return "Bem vindo ao Digital Inovation One!";
    }
}
