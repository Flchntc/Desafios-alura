package com.br.alura.moviequotes.repository;

import com.br.alura.moviequotes.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Frases, Long> {
    @Query(value = "SELECT * FROM frases ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Optional<Frases> obterFrases();
}
