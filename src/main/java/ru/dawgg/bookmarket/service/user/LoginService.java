package ru.dawgg.bookmarket.service.user;

import ru.dawgg.bookmarket.form.LoginForm;
import ru.dawgg.bookmarket.transfer.TokenDto;

public interface LoginService {

    TokenDto login(LoginForm loginForm);
}
