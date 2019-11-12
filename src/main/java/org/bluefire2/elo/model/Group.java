package org.bluefire2.elo.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PLAYERGROUP")
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    private long id;

    @Column(name = "GROUP_NAME")
    @Getter
    private String name;

    @OneToMany
    @Getter
    private List<Game> games;

    @OneToMany
    @Getter
    private List<Player> players;
}
