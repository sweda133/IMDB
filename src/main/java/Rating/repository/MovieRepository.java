package Rating.repository;

import Rating.model.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
public class MovieRepository extends CrudRepository<Movie,Integer> {
    public List<Movie> findAll();
    public Movie findById(int id);

}
