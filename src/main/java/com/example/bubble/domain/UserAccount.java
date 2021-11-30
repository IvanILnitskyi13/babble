package com.example.bubble.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

//    @OneToMany(cascade = CascadeType.REMOVE)
//    private List<Workspace> userWorksSpaces;


    public UserAccount() {
    }

    public UserAccount(User user) {
        this.user = user;
    }
}
