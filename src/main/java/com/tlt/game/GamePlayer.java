package com.tlt.game;

import java.util.HashMap;
import java.util.Vector;

import lombok.ToString;

@ToString
public class GamePlayer {

    private final HashMap<Long, Long> playerGames = new HashMap<>();

    public void addConnection(final Player player, final Game game) {
        playerGames.put(player.getId(), game.getId());
    }


}
