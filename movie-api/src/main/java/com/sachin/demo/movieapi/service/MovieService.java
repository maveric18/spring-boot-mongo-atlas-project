package com.sachin.demo.movieapi.service;

import com.sachin.demo.movieapi.entity.Movies;
import com.sachin.demo.movieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movies> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movies> getSingleMovie(String imdbId){
        return movieRepository.findMoviesByImdbId(imdbId);
    }
}
