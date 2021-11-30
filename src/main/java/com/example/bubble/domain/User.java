package com.example.bubble.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @NotNull
    private String email;
    private String login;

    @NotNull
    private String password;
    private Byte[] avatar;

    @OneToOne(mappedBy = "user")
    private UserAccount userAccount;

    public User(@NotNull String email, String login, @NotNull String password) {
        this.email = email;
        this.login = login;
        this.password = password;
    }
}
