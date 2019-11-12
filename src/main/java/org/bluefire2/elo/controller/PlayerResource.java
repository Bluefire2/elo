package org.bluefire2.elo.controller;

import org.bluefire2.elo.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerResource {
    private final PlayerDao playerDao;

    public PlayerResource(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    @GetMapping ("/players")
    public List<Player> retrieveAllGroups() {
        return playerDao.findAll();
    }
}
