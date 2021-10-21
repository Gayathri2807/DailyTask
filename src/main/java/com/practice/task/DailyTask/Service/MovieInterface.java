package com.practice.task.DailyTask.Service;

import com.practice.task.DailyTask.Model.Movie;

import java.util.List;

public interface MovieInterface {
    public List<Movie> getMovies();

    public List<Movie> getHindiMovie();

    public static String printMovies(){
        return "In static";
    }

    default String printMovies1(){
        return "In default";
    }
}
