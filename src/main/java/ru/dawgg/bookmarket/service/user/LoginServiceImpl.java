package ru.dawgg.bookmarket.service.user;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.dawgg.bookmarket.form.LoginForm;
import ru.dawgg.bookmarket.model.Token;
import ru.dawgg.bookmarket.model.User;
import ru.dawgg.bookmarket.repository.TokenRepository;
import ru.dawgg.bookmarket.repository.UserRepository;
import ru.dawgg.bookmarket.transfer.TokenDto;

import java.util.Optional;

import static ru.dawgg.bookmarket.transfer.TokenDto.from;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenRepository tokenRepository;

    public TokenDto login(LoginForm loginForm) {
        Optional<User> userCandidate = userRepository.findOneByLogin(loginForm.getLogin());

        if (userCandidate.isPresent()) {
            User user = userCandidate.get();

            if (passwordEncoder.matches(loginForm.getPassword(), user.getHashPassword())) {
                Token token = Token.builder()
                        .user(user)
                        .value(RandomStringUtils.random(10, true, true))
                        .build();

                tokenRepository.save(token);

                return from(token);
            }
        }
        throw new IllegalArgumentException("user is not found");
    }
}
