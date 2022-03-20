package com.example.babble.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="user")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @NotNull
    private String email;

    @NotNull
    private String password;
    private Byte[] avatar;

    @OneToOne(mappedBy = "user")
    private UserAccount userAccount;

    public User(@NotNull String email, @NotNull String password) {
        this.email = email;
        this.password = password;
    }
}
