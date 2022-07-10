package com.aap.data.update.cache;

import com.aap.data.update.data.Movie;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    static List<Movie> movies = new ArrayList<>();

    public static List<Movie> getMovies() {
        return movies;
    }

    public static int addMovie(Movie movie) {
        movies.add(movie);
        return movies.size();
    }
}
