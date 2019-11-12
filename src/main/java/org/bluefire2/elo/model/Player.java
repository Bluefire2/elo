package org.bluefire2.elo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter
    private long id;

    @ManyToOne
    @Getter
    @JsonBackReference
    private User user;

    @OneToOne
    @Getter
    @JsonManagedReference
    private Group group;

    public static Player build(User user, Group group) {
        Player player = new Player();
        player.user = user;
        player.group = group;

        group.addPlayer(player);
        user.addPlayer(player);
        return player;
    }
}
