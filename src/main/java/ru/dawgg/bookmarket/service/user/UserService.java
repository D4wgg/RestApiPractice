package ru.dawgg.bookmarket.service.user;

import ru.dawgg.bookmarket.dto.UserDto;
import ru.dawgg.bookmarket.model.User;

import java.util.List;

public interface UserService {

    void signUp(UserDto userDto);

    List<User> findAll();

    User findOneById(Long id);
}