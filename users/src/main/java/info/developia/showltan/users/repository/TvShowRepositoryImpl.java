package info.developia.showltan.users.repository;

import info.developia.showltan.users.domain.TvShow;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TvShowRepositoryImpl implements TvShowRepository {

    @Override
    public Optional<List<TvShow>> findAll() {
        return Optional.empty();
    }

}
