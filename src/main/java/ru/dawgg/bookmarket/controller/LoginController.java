package ru.dawgg.bookmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dawgg.bookmarket.form.LoginForm;
import ru.dawgg.bookmarket.service.user.LoginService;
import ru.dawgg.bookmarket.transfer.TokenDto;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<TokenDto> login(@RequestBody LoginForm loginForm) {
        return ResponseEntity.ok(loginService.login(loginForm));
    }
}
