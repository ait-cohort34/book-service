package ait.cohort34.book.dao;

import ait.cohort34.book.model.Publisher;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface PublisherRepository {

    List<String> findByPublishersAuthor(String authorName);

    Stream<Publisher> findDistinctByBooksAuthorsName(String authorName);

    Optional<Publisher> findById(String publisher);

    Publisher save(Publisher publisher);
}
