package com.example.bubble.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @NotNull
    private String email;
    private String login;

    @NotNull
    private String password;
    private Byte[] avatar;

    @OneToOne(cascade = CascadeType.REMOVE)
    private UserAccount userAccount;

}
