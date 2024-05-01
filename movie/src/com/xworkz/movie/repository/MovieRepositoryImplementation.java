package com.xworkz.movie.repository;

import com.xworkz.movie.dto.MovieDto;

public class MovieRepositoryImplementation implements com.xworkz.movie.repository.MovieRepository {
    private MovieDto[] dtos = new MovieDto[10]; // Maximum 10 movies
    private int index = 0;

    @Override
    public boolean save(MovieDto movieDto) {
        if (index < dtos.length) {
            dtos[index++] = movieDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }
}
