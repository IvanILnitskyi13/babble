package com.example.babble.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="attached_users")
@NoArgsConstructor
@Getter
@Setter
public class AttachedUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_attached_user")
    private Long idAttachedUser;

    @OneToOne
    private User user;

    @OneToOne
    private Channel channel;

    @OneToOne
    private Message message;

}
