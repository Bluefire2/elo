package org.bluefire2.elo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @Getter
    @Setter
    private String email;

    @OneToMany(mappedBy = "user")
    @Getter
    @JsonManagedReference
    private Collection<Player> players;

    public User() {}

    public User(String email) {
        this.players = new HashSet<>();
        this.email = email;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
