package com.example.bubble.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_message")
    private Long idMessage;

    @Column(name = "message_content")
    private String messageContent;
    private LocalDateTime date;

    @ManyToOne
    private Channel channel;

    @OneToOne
    private AttachedUser attachedUser;


}
