package info.developia.showltan.users.repository;

import info.developia.showltan.users.domain.TvShow;
import info.developia.showltan.users.model.Tag;

import java.util.Optional;
import java.util.Set;

public interface TvShowRepository {

    Optional<TvShow> findByTitle(String title);
    Optional<Set<TvShow>> findByDirector(String director);
    Optional<Set<TvShow>> findByTags(Set<Tag> tags);

}
