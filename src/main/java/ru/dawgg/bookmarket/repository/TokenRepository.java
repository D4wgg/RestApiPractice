package ru.dawgg.bookmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dawgg.bookmarket.model.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {
}