package com.greenfoxacademy.bibliotheca.repository;
import com.greenfoxacademy.bibliotheca.model.BookShelf;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookShelf, Long> {

    List<BookShelf> findAllByTitleIsContaining(String title);
    List<BookShelf> findAllByAuthorIsContaining(String author);
    List<BookShelf> findAllByIsbnIsLike(String isbn);
    List<BookShelf> findAllByYearIsLike(String year);

    @Query(value = "SELECT * FROM book_shelf WHERE (favourite = TRUE)", nativeQuery = true)
    List<BookShelf> listFavourites();

    @Query(value = "SELECT * FROM book_shelf ORDER BY (score) DESC", nativeQuery = true)
    List<BookShelf> orderedByScore();

    @Query(value = "SELECT * FROM book_shelf ORDER BY (isbn)", nativeQuery = true)
    List<BookShelf> orderedByIsbn();

    List<BookShelf> findAllByAuthor(String author);
}
