package com.example.babble.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="channels")
@NoArgsConstructor
@Getter
@Setter
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
