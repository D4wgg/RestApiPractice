package ru.dawgg.bookmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dawgg.bookmarket.form.UserForm;
import ru.dawgg.bookmarket.service.user.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/signUp")
public class SignUpController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<Object> signUserUp(@RequestBody UserForm userForm) {
        service.signUp(userForm);
        return ResponseEntity.ok().build();
    }
}
