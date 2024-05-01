package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.repository.MovieRepositoryImplementation;

public class MovieServiceImplementation implements com.xworkz.movie.service.MovieService {
    private MovieRepository movieRepository = new MovieRepositoryImplementation();

    @Override
    public boolean validateAndSave(MovieDto movieDto) {
        if (movieDto != null) {
            if (movieDto.getMovieTitle() != null && movieDto.getDirector() != null && movieDto.getReleaseYear() > 0) {
                boolean saved = movieRepository.save(movieDto);
                if (saved) {
                    System.out.println("Movie saved successfully");
                    return true;
                }
            } else {
                System.out.println("Invalid MovieDto fields");
            }
        }
        return false;
    }
}
