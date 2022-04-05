package ru.dawgg.bookmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dawgg.bookmarket.dto.AuthorDto;
import ru.dawgg.bookmarket.model.Author;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> findAuthor(String name, String surname, LocalDate birthDate);

    default Optional<Author> findAuthorByPersonalData(AuthorDto authorDto) {
        return findAuthor(authorDto.getName(), authorDto.getSurname(), authorDto.getBirthDate());
    }
}