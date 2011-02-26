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

}
