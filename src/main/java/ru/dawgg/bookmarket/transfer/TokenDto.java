package ru.dawgg.bookmarket.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.dawgg.bookmarket.model.Token;

@Data
@AllArgsConstructor
public class TokenDto {

    private String value;

    public static TokenDto from(Token token) {
        return new TokenDto(token.getValue());
    }
}
