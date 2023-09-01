package com.javaunit3.springmvc;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// Create a new class BestMovieService. Define it as a spring component so that it will be available in the Spring application context.
@Component
public class BestMovieService {
    private Movie movie;
    //Define a private Movie property, and use Spring annotations so that it is Autowired
    @Autowired
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    //Define a method getBestMovie() that returns the movie
    public Movie getBestMovie() {
        return movie;
    }
    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }
}

