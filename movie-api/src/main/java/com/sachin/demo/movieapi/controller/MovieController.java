package com.sachin.demo.movieapi.controller;

import com.sachin.demo.movieapi.service.MovieService;
import com.sachin.demo.movieapi.entity.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movies>> allMovies() {
        return new ResponseEntity<List<Movies>>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movies>>(movieService.getSingleMovie(imdbId), HttpStatus.OK);
    }
}
