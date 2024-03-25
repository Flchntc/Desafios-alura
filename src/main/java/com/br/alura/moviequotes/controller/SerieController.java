package com.br.alura.moviequotes.controller;


import com.br.alura.moviequotes.dto.FrasesDTO;
import com.br.alura.moviequotes.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {
    @Autowired
    private FrasesService servico;

    @GetMapping("/frases")
    public FrasesDTO obterFrases(){
        return servico.obterFrases();
    }
}
