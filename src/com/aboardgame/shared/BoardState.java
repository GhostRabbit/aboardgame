package com.aboardgame.shared;

import java.io.Serializable;

public class BoardState implements Serializable {

    private static final long serialVersionUID = 8522010474779231157L;

    private CellState[] states;

    private int gameId;

    public BoardState(int gameId, CellState[] states) {
        this.gameId = gameId;
        if (states.length != 9) {
            throw new IllegalArgumentException("Only accepts 9 CellStates");
        }
        this.states = states;
    }

    public CellState[] getCellStates() {
        return states;
    }

    public int getGameId() {
        return gameId;
    }
}
