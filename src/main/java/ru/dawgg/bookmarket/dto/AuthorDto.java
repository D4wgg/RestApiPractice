package ru.dawgg.bookmarket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class AuthorDto {
    private String name;
    private String surname;
    private LocalDate birthDate;
}
