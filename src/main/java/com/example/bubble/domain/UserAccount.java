package com.example.bubble.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user_accounts")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUserAccount;

    @OneToOne
    private User user;

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Workspace> userWorksSpaces;

}
