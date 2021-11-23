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
    @Column(name = "id_user_account")
    private Long idUserAccount;

    @OneToOne
    private User user;

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Workspace> userWorksSpaces;

}
