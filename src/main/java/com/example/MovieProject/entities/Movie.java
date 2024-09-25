package com.example.MovieProject.entities;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;
    
    @Column(nullable = false, length = 200)
    @NotBlank(message = "Please provide a title for this field !")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide a director's name for this field")
    private String director;

    @Column(nullable = false )
    @NotBlank(message = "Please provide a movie's studio for this field ")
    private String studio;

    @ElementCollection
    @CollectionTable(name ="movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "Please provide a movie's release year for this field")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message= "Please provide a movie's poster for this field")
    private String poster;

}
