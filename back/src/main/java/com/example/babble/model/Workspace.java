package com.example.babble.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
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
