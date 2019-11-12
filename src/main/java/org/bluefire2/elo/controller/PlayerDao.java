package org.bluefire2.elo.controller;

import org.bluefire2.elo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDao extends JpaRepository<Player, Long> {

}
