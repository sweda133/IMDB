package rating;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Movie {
    @Id //setting primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto generated value for interger id
    private int id;
    private String movieName;
    private String movieDescription;

    @Override
    public String toString() //converted into Json
    {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                '}';
    }

    public Movie()
    {
        this.id=0;
        this.movieName="";
        this.movieDescription="";
    }

    public Movie(int id, String movieName, String movieDescription) {
        // This keyword is refer to the current context of java class class
        this.id = id;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
    }

    // Getters are for getting the details and Setters are for assigning the details to the variables.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }


}