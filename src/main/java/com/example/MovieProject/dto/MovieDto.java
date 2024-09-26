package com.example.MovieProject.dto;

import java.util.Set;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    
    private Integer movieId;
    
    @NotBlank(message = "Please provide a title for this field !")
    private String title;

    
    @NotBlank(message = "Please provide a director's name for this field")
    private String director;

    
    @NotBlank(message = "Please provide a movie's studio for this field ")
    private String studio;

    private Set<String> movieCast;
    
    private Integer releaseYear;

    @NotBlank(message= "Please provide a movie's poster for this field")
    private String poster;

    @NotBlank(message= "Please provide a poster's url")
    private String posterUrl;
}
