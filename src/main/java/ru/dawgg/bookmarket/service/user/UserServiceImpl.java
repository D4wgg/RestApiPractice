package ru.dawgg.bookmarket.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dawgg.bookmarket.exception.InnerApiException;
import ru.dawgg.bookmarket.dto.UserDto;
import ru.dawgg.bookmarket.model.User;
import ru.dawgg.bookmarket.model.usercharacteristic.Role;
import ru.dawgg.bookmarket.model.usercharacteristic.State;
import ru.dawgg.bookmarket.repository.UserRepository;

import java.util.List;

import static ru.dawgg.bookmarket.exception.ApiEntityNotFoundException.USER_NOT_FOUND_EXCEPTION;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public void signUp(UserDto userDto) {
        userRepository.save(User.builder()
                .login(userDto.getLogin())
                .hashPassword(userDto.getPassword())
                .name(userDto.getName())
                .surname(userDto.getSurname())
                .role(Role.USER)
                .state(State.ACTIVE)
                .build());
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOneById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(new InnerApiException(USER_NOT_FOUND_EXCEPTION));
    }
}