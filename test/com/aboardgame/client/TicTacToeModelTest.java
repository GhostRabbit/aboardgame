package com.aboardgame.client;

import static org.junit.Assert.*;

import org.junit.Test;


public class TicTacToeModelTest {

    @Test
    public void newBoardModelShouldHave9CellModels() {
        TicTacToeModel model = new TicTacToeModel();
        assertEquals(9, model.getCells().length);
    }
    
    @Test
    public void newBoardModelShouldHaveAllEmptyCells() {
        TicTacToeModel model = new TicTacToeModel();
        assertTrue(CellModel.class.isAssignableFrom(model.getCells()[0].getClass()));
        for (CellModel cell : model.getCells()) {
            assertEquals(CellState.EMPTY, cell.getState());
        }
    }
}
