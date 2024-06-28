package com.alura.desafio_spring.SpringBoot.service;

import com.alura.desafio_spring.SpringBoot.dto.FraseDTO;
import com.alura.desafio_spring.SpringBoot.model.Frases;
import com.alura.desafio_spring.SpringBoot.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;
    public FraseDTO obterFraseAleatoria() {
        Frases frases = repository.buscaFrasesAleatoria();
        return new FraseDTO(frases.getTitulo(), frases.getFrase(),frases.getPersonagem(),frases.getPoster());
    }
}
