package ru.dawgg.bookmarket.service.author;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dawgg.bookmarket.dto.AuthorDto;
import ru.dawgg.bookmarket.exception.ApiEntityNotFoundException;
import ru.dawgg.bookmarket.model.Author;
import ru.dawgg.bookmarket.repository.AuthorRepository;

import static ru.dawgg.bookmarket.exception.ApiEntityNotFoundException.AUTHOR_NOT_FOUND_EXCEPTION;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Author findAuthorByPersonalData(AuthorDto authorDto) {
        return authorRepository.findAuthorByPersonalData(authorDto)
                .orElseThrow(new ApiEntityNotFoundException(AUTHOR_NOT_FOUND_EXCEPTION));
    }
}