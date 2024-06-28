package com.alura.desafio_spring.SpringBoot.controller;

import com.alura.desafio_spring.SpringBoot.dto.FraseDTO;
import com.alura.desafio_spring.SpringBoot.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;
    @GetMapping("/serie/frases")
    public FraseDTO obterFraseAleatoria(){
        return service.obterFraseAleatoria();
    }
}
