package com.tlt.playlist;

import java.util.TreeMap;
import java.util.TreeSet;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PlayList {

    private final Long id;
    private final TreeSet<Movie> movies = new TreeSet<>();

    public void addMovie(final Movie movie) {
        movies.add(movie);
    }
}
