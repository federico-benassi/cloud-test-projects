package federico.benassi.moviesloader.controllers;

import federico.benassi.moviesloader.models.Movie;
import federico.benassi.moviesloader.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    private MoviesService service;

    @Autowired
    MoviesController(MoviesService service){
        this.service = service;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> get(){
        return ResponseEntity.ok(service.get());
    }
}
