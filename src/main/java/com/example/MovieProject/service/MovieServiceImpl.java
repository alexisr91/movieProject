package com.example.MovieProject.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.MovieProject.dto.MovieDto;
import com.example.MovieProject.entities.Movie;
import com.example.MovieProject.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Value;


@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final FileService fileService;

    @Value("${project.poster}")
    private String path;

    public MovieServiceImpl(MovieRepository movieRepository, FileService fileService){
        this.movieRepository = movieRepository;
        this.fileService = fileService;

    }

    @Override
    public MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException {
        // 1. Upload the file
        String uploadedFileName= fileService.uploadFile(path, file);

        // 2. Set the value of field 'poster' as filename 
        movieDto.setPoster(uploadedFileName);

        // 3. map dto to Movie object
        Movie movie = new Movie(
            movieDto.getMovieId(),
            movieDto.getTitle(),
            movieDto.getDirector(),
            movieDto.getStudio(),
            movieDto.getMovieCast(),
            movieDto.getReleaseYear(),
            movieDto.getPoster()
        );

        // 4. save the movie object -> return the saved movie obj
        Movie savedMovie = movieRepository.save(movie);

        // 5. generate the posterURL 
        

        // 6. map Movie object to DTO object and return it
       return null;
    }

    @Override
    public MovieDto getMovie(Integer movieId) {
        return null;
    }

    @Override
    public List<MovieDto> getAllMovies() {
        return null;
    }
}
