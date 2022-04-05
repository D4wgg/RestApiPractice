package ru.dawgg.bookmarket.service.author;

import ru.dawgg.bookmarket.dto.AuthorDto;
import ru.dawgg.bookmarket.model.Author;

public interface AuthorService {
    Author findAuthorByPersonalData(AuthorDto authorDto);
}