package com.example.bubble.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="attached_users")
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
