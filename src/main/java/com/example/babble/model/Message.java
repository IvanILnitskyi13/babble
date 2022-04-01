package com.example.babble.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="messages")
@NoArgsConstructor
@Getter
@Setter
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
