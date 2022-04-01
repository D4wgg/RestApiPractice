package ru.dawgg.bookmarket.model;

import lombok.*;
import ru.dawgg.bookmarket.model.userCharacteristic.Role;
import ru.dawgg.bookmarket.model.userCharacteristic.State;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String hashPassword;
    private String name;
    private String surname;

    @Enumerated(EnumType.STRING)
    private Role role;
    @Enumerated(EnumType.STRING)
    private State state;

    @OneToMany(mappedBy = "user")
    private List<Token> tokens;
}
