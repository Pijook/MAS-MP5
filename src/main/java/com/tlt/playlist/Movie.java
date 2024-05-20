package com.tlt.playlist;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie implements Comparable<Movie> {

    private final Long id;
    private final String name;

    @Override
    public int compareTo(Movie o) {
        return o.getId().compareTo(this.getId());
    }
}
