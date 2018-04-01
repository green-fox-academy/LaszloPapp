package com.greenfoxacademy.bibliotheca.repository;
import com.greenfoxacademy.bibliotheca.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAllByTitleIsContaining(String title);
    List<Book> findAllByAuthorIsContaining(String author);
    List<Book> findAllByIsbnIsLike(String isbn);
    List<Book> findAllByYearIsLike(String year);

    @Query(value = "SELECT * FROM book_shelf WHERE (favourite = TRUE)", nativeQuery = true)
    List<Book> listFavourites();

    @Query(value = "SELECT * FROM book_shelf ORDER BY (score) DESC", nativeQuery = true)
    List<Book> orderedByScore();

    @Query(value = "SELECT * FROM book_shelf ORDER BY (isbn)", nativeQuery = true)
    List<Book> orderedByIsbn();

    List<Book> findAllByAuthor(String author);
}
