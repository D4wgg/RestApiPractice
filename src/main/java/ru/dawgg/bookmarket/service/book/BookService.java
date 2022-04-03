package ru.dawgg.bookmarket.service.book;

import ru.dawgg.bookmarket.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findOne(Long id);
}