package com.aboardgame.client;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
    
    @Test
    public void cleanGetStateShouldReturnEmpty() {
        TicTacToeModel model = new TicTacToeModel();
        TicTacToeCell cell = mock(TicTacToeCell.class);
        assertEquals(CellState.EMPTY, model.getState(cell));
    }
    
    @Test
    public void nextStateShouldUpdateModelOnlyOnce() {
        TicTacToeModel model = new TicTacToeModel();
        TicTacToeCell cell = mock(TicTacToeCell.class);
        assertEquals(CellState.EMPTY, model.getState(cell));
        assertEquals(CellState.CROSS, model.nextState(cell));
        assertEquals(CellState.CROSS, model.getState(cell));
        assertEquals(CellState.CROSS, model.nextState(cell));
        assertEquals(CellState.CROSS, model.getState(cell));
    }
    
}
