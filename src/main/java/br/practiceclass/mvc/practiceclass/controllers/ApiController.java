package br.practiceclass.mvc.practiceclass.controllers;
import br.practiceclass.mvc.practiceclass.models.Movies;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class ApiController {


    private static final List<Movies> movies = new ArrayList<Movies>();

    public ApiController() {
        movies.add (new Movies("A volta dos que nao foram", "Drama", 1932));
        movies.add (new Movies("Os longos cabelos do careca", "Terror",1953));
        movies.add (new Movies("O dente do banguelo", "Comédia", 1999));

    }

    @GetMapping
    public List<Movies> getAlunos(){
        return movies;
    }

}
