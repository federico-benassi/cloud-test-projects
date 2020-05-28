package federico.benassi.moviesloader.services;

import federico.benassi.moviesloader.models.Movie;
import federico.benassi.moviesloader.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MoviesServiceImpl implements MoviesService {

    MoviesRepository repository;

    @Autowired
    public MoviesServiceImpl(MoviesRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Movie> get() {
        List<Movie> movies = new ArrayList<>();
        repository.findAll().forEach(movies::add);
        return movies;
    }
}
