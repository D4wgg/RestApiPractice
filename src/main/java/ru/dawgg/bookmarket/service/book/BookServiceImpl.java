package ru.dawgg.bookmarket.service.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dawgg.bookmarket.exception.InnerApiException;
import ru.dawgg.bookmarket.model.Book;
import ru.dawgg.bookmarket.repository.BookRepository;

import java.util.List;

import static ru.dawgg.bookmarket.exception.InnerApiException.BOOK_NOT_FOUND_EXCEPTION;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book findOne(Long id) {
        return repository.findById(id).orElseThrow(new InnerApiException(BOOK_NOT_FOUND_EXCEPTION));
    }
}