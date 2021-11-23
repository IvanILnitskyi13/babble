package com.example.bubble.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_workspace")
    private Long idWorkspace;

    @Column(name = "workspace_name")
    private String workspaceName;

    @ManyToOne
    private UserAccount userAccount;

    @OneToMany
    private List<Channel> channels;
}
