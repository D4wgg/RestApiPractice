package ru.dawgg.bookmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dawgg.bookmarket.model.Author;
import ru.dawgg.bookmarket.model.Book;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(Author author);

    List<Book> findAllByReleaseDate(LocalDate releaseDate);
}
