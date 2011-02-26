package com.aboardgame.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aboardgame.shared.CellState;

public class CellModelTest {

    @Test
    public void newCellIsEmpty() {
        assertEquals(CellState.EMPTY, new CellModel().getState());
    }

    @Test
    public void cellShouldRememberRing() {
        CellModel model = new CellModel();
        model.setState(CellState.RING);
        assertEquals(CellState.RING, model.getState());
    }

    @Test
    public void cellShouldRememberCross() {
        CellModel model = new CellModel();
        model.setState(CellState.CROSS);
        assertEquals(CellState.CROSS, model.getState());
    }

    @Test
    public void modelShouldOnlyAllowEmptyToBeChanged() {
        CellModel model = new CellModel();
        model.setState(CellState.RING);
        try {
            model.setState(CellState.RING);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertFalse(e.getMessage().isEmpty());
        }
    }
}
