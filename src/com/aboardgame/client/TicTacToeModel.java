package com.aboardgame.client;

public class TicTacToeModel {

    final CellModel[] cells = new CellModel[] {
        new CellModel(),  
        new CellModel(),  
        new CellModel(),  
        new CellModel(),  
        new CellModel(),  
        new CellModel(),  
        new CellModel(),  
        new CellModel(),  
        new CellModel()
    };
    
    public CellModel[] getCells() {
        return cells;
    }

    public CellState getState(TicTacToeCell cell) {
        return getModel(cell).getState();
    }

    private CellModel getModel(TicTacToeCell cell) {
        return cells[cell.getPosition()];
    }

    public CellState nextState(TicTacToeCell cell) {
        if (CellState.EMPTY == getState(cell)) {
            getModel(cell).setState(CellState.CROSS);
        }
        return getState(cell);
    }

    // To be replaced with real persistence
    public void fakeComplexState() {
        cells[0].setState(CellState.RING);
        cells[4].setState(CellState.RING);
        cells[8].setState(CellState.RING);
        cells[5].setState(CellState.CROSS);
        cells[6].setState(CellState.CROSS);
    }

}
