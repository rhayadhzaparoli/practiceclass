package br.practiceclass.mvc.practiceclass.controllers;
import br.practiceclass.mvc.practiceclass.models.Movies;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller

//Acesso do controller - trigger para url
@RequestMapping("/movies")

public class MoviesController {

    private static final List<Movies> movies = new ArrayList<Movies>();


    public  MoviesController() {
        movies.add(new Movies("A volta dos que nao foram", "Drama", 1932));
        movies.add(new Movies("Os longos cabelos do careca", "Terror", 1953));
        movies.add(new Movies("O dente do banguelo", "Comédia", 1999));
    }

    @GetMapping
    public String getMovies(Model model) {
        model.addAttribute("movies", movies);
        return "Movies";

    }
}