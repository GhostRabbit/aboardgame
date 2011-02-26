package com.aboardgame.shared;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aboardgame.shared.CellState;

public class CellStateTest {

    @Test
    public void creation() {
        assertNotNull(CellState.EMPTY);
        assertNotNull(CellState.CROSS);
        assertNotNull(CellState.RING);
    }
}
