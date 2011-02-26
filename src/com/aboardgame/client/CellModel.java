package com.aboardgame.client;

public class CellModel {

    private CellState state = CellState.EMPTY;

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        if (this.state == CellState.EMPTY) {
            this.state = state;
        } else {
            throw new RuntimeException("Illegal move");
        }
    }

}
