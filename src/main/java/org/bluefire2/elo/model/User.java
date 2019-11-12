package org.bluefire2.elo.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    private long id;

    @Getter
    private String email;

    @OneToMany
    @Getter
    private Collection<Player> players;
}
