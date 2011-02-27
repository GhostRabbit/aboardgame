package com.aboardgame.shared;


public class FakeBoardState extends BoardState {

    private static final long serialVersionUID = 1423168042556916551L;

    public FakeBoardState() {
        super(42, new CellState[] { CellState.RING, CellState.EMPTY, CellState.EMPTY, CellState.EMPTY, CellState.RING,
                CellState.CROSS, CellState.CROSS, CellState.EMPTY, CellState.RING });
    };
}
