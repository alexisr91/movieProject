package com.example.MovieProject.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.example.MovieProject.dto.MovieDto;

public interface MovieService {
    

    MovieDto addMovie(MovieDto movieDto, MultipartFile file);
    MovieDto getMovie(Integer movieId);

    List<MovieDto> getAllMovies();
}
