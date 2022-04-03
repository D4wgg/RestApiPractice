package ru.dawgg.bookmarket.service.author;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dawgg.bookmarket.repository.AuthorRepository;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
}