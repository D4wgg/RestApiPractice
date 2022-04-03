package ru.dawgg.bookmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dawgg.bookmarket.model.Book;
import ru.dawgg.bookmarket.service.book.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping
    public List<Book> showAllBooks() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Book showTheBook(@PathVariable("id") Long id) {
        return service.findOne(id);
    }
}
