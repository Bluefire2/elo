insert into USER (ID, EMAIL) values
    (1, N'kc875@cornell.edu'),
    (2, N'ry92@cornell.edu'),
    (3, N'aaa1@cornell.edu'),
    (4, N'aa363@cornell.edu');

-- Group 1: 1, 2, 3, 4
-- Group 2: 3, 4
insert into PLAYERGROUP (ID, GROUP_NAME) values
    (1, N'First group'),
    (2, N'Second group');
insert into PLAYER (ID, GROUP_ID, USER_ID) values
    (1, 1, 1),
    (2, 1, 2),
    (3, 1, 3),
    (4, 1, 4),
    (5, 2, 3),
    (6, 2, 4);
insert into USER_PLAYERS (USER_ID, PLAYERS_ID) values
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (3, 5),
    (4, 6);
insert into PLAYERGROUP_PLAYERS (GROUP_ID, PLAYERS_ID) values
    (1, 1),
    (1, 2),
    (1, 3),
    (1, 4),
    (2, 3),
    (2, 4);