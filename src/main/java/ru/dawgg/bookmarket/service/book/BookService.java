package ru.dawgg.bookmarket.service.book;

import ru.dawgg.bookmarket.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findOne(Long id);
}
