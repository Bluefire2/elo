package org.bluefire2.elo.model;

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
    private User user;

    @OneToOne
    @Getter
    private Group group;
}
