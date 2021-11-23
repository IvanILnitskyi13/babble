package com.example.bubble.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="channels")
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChannel;

    @Column(name = "channel_name")
    private String channelName;
    private String topic;
    private String description;

    @OneToMany
    private List<AttachedUser> attachedUsers;

    @ManyToOne
    private Workspace workspace;
}
