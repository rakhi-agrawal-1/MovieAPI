package dev.rakhi.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

@Autowired
private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> findMovieByImdbId(String imdbID) {
        return movieRepository.findMovieByImdbId(imdbID);
    }
}

