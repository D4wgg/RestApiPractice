package ru.dawgg.bookmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dawgg.bookmarket.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
//    List<Author> findAuthorByPersonalData(AuthorForm authorForm);
}
