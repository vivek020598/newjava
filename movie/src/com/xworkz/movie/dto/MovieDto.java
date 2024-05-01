package com.xworkz.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MovieDto {
    private String movieTitle;
    private String director;
    private int releaseYear;
    private double boxOfficeRevenue;

    @Override
    public String toString() {
        return "MovieTitle: " + movieTitle + ", Director: " + director + ", ReleaseYear: " + releaseYear + ", BoxOfficeRevenue: " + boxOfficeRevenue;
    }
}
