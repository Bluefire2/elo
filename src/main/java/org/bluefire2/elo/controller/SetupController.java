package org.bluefire2.elo.controller;

import org.bluefire2.elo.model.Group;
import org.bluefire2.elo.model.Player;
import org.bluefire2.elo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashSet;

@RestController
public class SetupController {
    private final UserDao userDao;
    private final PlayerDao playerDao;
    private final GroupDao groupDao;

    public SetupController(UserDao userDao, PlayerDao playerDao, GroupDao groupDao) {
        this.userDao = userDao;
        this.playerDao = playerDao;
        this.groupDao = groupDao;
    }

    @PostMapping ("/setup")
    public ResponseEntity<Object> setup() {
        Collection<User> users = new HashSet<>();
        User kc875 = new User("kc875@cornell.edu");
        users.add(kc875);
        User ry92 = new User("ry92@cornell.edu");
        users.add(ry92);
        User userA = new User("aaa1@cornell.edu");
        users.add(userA);
        User userB = new User("aa363@cornell.edu");
        users.add(userB);
        userDao.saveAll(users);

        Collection<Group> groups = new HashSet<>();
        Group firstGroup = new Group("First group");
        Group secondGroup = new Group("Second group");
        groups.add(firstGroup);
        groups.add(secondGroup);
        groupDao.saveAll(groups);

        Collection<Player> players = new HashSet<>();
        players.add(Player.build(kc875, firstGroup));
        players.add(Player.build(ry92, firstGroup));
        players.add(Player.build(userA, firstGroup));
        players.add(Player.build(userB, firstGroup));
        players.add(Player.build(userA, firstGroup));
        players.add(Player.build(userB, firstGroup));
        playerDao.saveAll(players);

        return ResponseEntity.ok().build();
    }
}
