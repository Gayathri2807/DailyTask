package com.practice.task.DailyTask.Controller;

import com.practice.task.DailyTask.Model.Movie;
import com.practice.task.DailyTask.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

   /* @GetMapping("/movies")
    public List<Movie> getMovies(){
        List<Movie> movieList  = movieService.setMovie();
        return movieList;
    }
*/
    /***
     *
     * @return Prints the movie details in MovieService.java
     */
    @GetMapping("/movies")
    public List<Movie> getMovies(){
        return this.movieService.getMovies();
    }
    /***
     *
     * @return list of movie details of type String
     */
    @GetMapping("/movies/{lang}")
    public List<Movie> getHindiMovie(){
        List<Movie> movies = movieService.getHindiMovie();
        List<String> name = new ArrayList<>();
        ArrayList<String> name1 = new ArrayList<>();

        return movies;
    }

    /***
     *
     * @return Prints the definition in static
     */
    @GetMapping("/moviestatic")
    public String getMovieStatic(){
        return this.movieService.getInterfaceMethod();
    }
    /***
     *
     * @return Prints the definition in default
     */
    @GetMapping("/moviedefault")
    public String getMovieDefault(){
        return this.movieService.printMovies1();
    }
}
