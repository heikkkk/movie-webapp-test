package dev.heik.tests.movies.repository;

import dev.heik.tests.movies.model.Movie;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
  Optional<Movie> findMovieByImdbId(String imdbId);
}
