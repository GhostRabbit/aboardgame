package com.aboardgame.client;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.aboardgame.client.view.CellView;


public class BoardModelTest {

    @Test
    public void newBoardModelShouldHave9CellModels() {
        BoardModel model = new BoardModel();
        assertEquals(9, model.getCells().length);
    }
    
    @Test
    public void newBoardModelShouldHaveAllEmptyCells() {
        BoardModel model = new BoardModel();
        assertTrue(CellModel.class.isAssignableFrom(model.getCells()[0].getClass()));
        for (CellModel cell : model.getCells()) {
            assertEquals(CellState.EMPTY, cell.getState());
        }
    }
    
    @Test
    public void cleanGetStateShouldReturnEmpty() {
        BoardModel model = new BoardModel();
        CellView cell = mock(CellView.class);
        assertEquals(CellState.EMPTY, model.getState(cell));
    }
    
    @Test
    public void nextStateShouldUpdateModelOnlyOnce() {
        BoardModel model = new BoardModel();
        CellView cell = mock(CellView.class);
        assertEquals(CellState.EMPTY, model.getState(cell));
        assertEquals(CellState.CROSS, model.nextState(cell));
        assertEquals(CellState.CROSS, model.getState(cell));
        assertEquals(CellState.CROSS, model.nextState(cell));
        assertEquals(CellState.CROSS, model.getState(cell));
    }
    
}
