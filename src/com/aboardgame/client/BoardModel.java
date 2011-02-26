package com.aboardgame.client;

import com.aboardgame.client.view.CellView;

public class BoardModel {

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

    public CellState getState(CellView cell) {
        return getModel(cell).getState();
    }

    private CellModel getModel(CellView cell) {
        return cells[cell.getPosition()];
    }

    public CellState nextState(CellView cell) {
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
