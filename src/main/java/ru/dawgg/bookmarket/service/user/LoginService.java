package ru.dawgg.bookmarket.service.user;

import ru.dawgg.bookmarket.dto.LoginDto;
import ru.dawgg.bookmarket.dto.TokenDto;

public interface LoginService {

    TokenDto login(LoginDto loginDto);
}