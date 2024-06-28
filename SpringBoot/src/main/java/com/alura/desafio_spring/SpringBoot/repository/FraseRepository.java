package com.alura.desafio_spring.SpringBoot.repository;

import com.alura.desafio_spring.SpringBoot.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frases, Long > {

    @Query("SELECT f FROM Frases f order by function ('RANDOM') LIMIT 1")
    Frases buscaFrasesAleatoria();
}
