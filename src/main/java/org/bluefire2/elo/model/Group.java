package org.bluefire2.elo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

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

    @OneToMany(mappedBy = "group")
    @Getter
    @JsonBackReference
    private Collection<Player> players;

    public Group() {}

    public Group(String name) {
        this.players = new HashSet<>();
        this.name = name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
