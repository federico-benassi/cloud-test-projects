package federico.benassi.moviesloader.repositories;

import federico.benassi.moviesloader.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<Movie, Long> {
}
