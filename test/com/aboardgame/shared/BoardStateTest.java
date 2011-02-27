package com.aboardgame.shared;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardStateTest {

    static CellState[] VALID_STATE = new CellState[] { CellState.CROSS, CellState.CROSS, CellState.CROSS,
            CellState.CROSS, CellState.CROSS, CellState.CROSS, CellState.CROSS, CellState.CROSS, CellState.CROSS};

    @Test
    public void boardStateonlyAccepts9CellStates() {
        try {
            new BoardState(0, null);
            fail("Expected NPE");
        } catch (NullPointerException e) {}
        try {
            new BoardState(0, new CellState[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {}
    }

    @Test
    public void boardStateRemembersState() {
        assertNotNull(new BoardState(0, VALID_STATE).getCellStates());
    }
    
    @Test
    public void rememberGameId() {
        assertEquals(2, new BoardState(2, VALID_STATE).getGameId());
    }
}
