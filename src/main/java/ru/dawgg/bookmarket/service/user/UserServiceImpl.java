package ru.dawgg.bookmarket.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dawgg.bookmarket.form.UserForm;
import ru.dawgg.bookmarket.model.User;
import ru.dawgg.bookmarket.model.userCharacteristic.Role;
import ru.dawgg.bookmarket.model.userCharacteristic.State;
import ru.dawgg.bookmarket.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public void signUp(UserForm userForm) {
        userRepository.save(User.builder()
                .login(userForm.getLogin())
                .hashPassword(userForm.getPassword())
                .name(userForm.getName())
                .surname(userForm.getSurname())
                .role(Role.USER)
                .state(State.ACTIVE)
                .build());
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findOneById(Long id) {
        return Optional.of(userRepository.findById(id)).orElseThrow(IllegalArgumentException::new);
    }
}
