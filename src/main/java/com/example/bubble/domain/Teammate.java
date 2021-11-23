package com.example.bubble.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Teammate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeammate;


    @OneToOne
    private User user;

    @ManyToOne
    private Workspace workspace;

}
