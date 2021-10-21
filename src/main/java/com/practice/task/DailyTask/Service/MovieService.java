package com.practice.task.DailyTask.Service;

import com.practice.task.DailyTask.Model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService implements  MovieInterface {

    private static List<Movie> movieList = new ArrayList<>();
    /***
     * Overriding the MovieInterface method
     * @return movieList
     */
    //@Override
    public List<Movie> getMovies() {
        Movie movie1 = new Movie("Visvaasam","Ajith","Tamil",2019);
        //movie1.setMname("Visvaasam");
        //movie1.setActor("Ajith");
        //movie1.setLanguage("Tamil");
        //movie1.setReleaseyear(2019);
        movieList.add(movie1);

        Movie movie2 = new Movie("Work it","Jordan Fisher","English",2020);
        movieList.add(movie2);

        Movie movie3 = new Movie("Ae dil hai mushkil","Ranbir Kapoor","Hindi",2016);
        movieList.add(movie3);

        Movie movie4 = new Movie("Dear Zindagi","Alia Bhatt","Hindi",2015);
        movieList.add(movie4);

        return movieList;
    }

    /***
     * Getting the particular movie data
     * @return movies
     */
   // @Override
    public List<Movie> getHindiMovie() {
        List<Movie> movies = movieList.stream().filter(employee -> employee.getLanguage() == "Hindi").collect(Collectors.toList());
        return movies;

    }

    /***
     *
     * @return the static function in MovieInterface
     */
    public String getInterfaceMethod() {
      return MovieInterface.printMovies();
    }

   /* public String getInterfaceMethod1() {
        return MovieInterface.printMovies1();
    }
    */


}