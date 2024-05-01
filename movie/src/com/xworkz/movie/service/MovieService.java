package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;

public interface MovieService {
    boolean validateAndSave(MovieDto movieDto);
}
