package com.xworkz.movie.tester;

import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImplementation;

public class MovieTester {
    public static void main(String[] args) {
        MovieDto movieDto = new MovieDto("Inception", "Christopher Nolan", 2010, 829.89);
        System.out.println(movieDto);
        MovieService movieService = new MovieServiceImplementation();
        boolean result = movieService.validateAndSave(movieDto);

        System.out.println("Movie validation and save result: " + result);

    }
}
