package ru.dawgg.bookmarket.service.user;

import ru.dawgg.bookmarket.form.UserForm;
import ru.dawgg.bookmarket.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void signUp(UserForm userForm);

    List<User> findAll();

    Optional<User> findOneById(Long id);
}
