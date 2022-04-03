package ru.dawgg.bookmarket.service.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dawgg.bookmarket.model.Book;
import ru.dawgg.bookmarket.repository.BookRepository;

import java.util.List;

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
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
}
