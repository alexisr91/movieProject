package com.example.MovieProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MovieProject.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    
}
