package com.br.alura.moviequotes.service;

import com.br.alura.moviequotes.dto.FrasesDTO;
import com.br.alura.moviequotes.model.Frases;
import com.br.alura.moviequotes.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class FrasesService {
    @Autowired
    private SerieRepository repositorio;

    public FrasesDTO obterFrases(){
            Optional<Frases> frase = repositorio.obterFrases();
            if(frase.isPresent()){
                Frases f = frase.get();
                return new FrasesDTO(f.getTitulo(),f.getFrase(),f.getPersonagem(),f.getPoster());
            }
            return null;
    }
}
