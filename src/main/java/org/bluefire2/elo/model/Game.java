package org.bluefire2.elo.model;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter
    private long id;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    @Getter
    private Instant created_at;

    @ManyToOne
    @Getter
    private Player playerA;
    @ManyToOne
    @Getter
    private Player playerB;

    @Getter
    private int result;
}
