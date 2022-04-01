package ru.dawgg.bookmarket.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Component
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String name;
    private BigDecimal price;
    private LocalDate releaseDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Book book = (Book) o;
        return bookId != null && Objects.equals(bookId, book.bookId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
