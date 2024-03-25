package com.br.alura.moviequotes;

import com.br.alura.moviequotes.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviequotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviequotesApplication.class, args);
	}

}
