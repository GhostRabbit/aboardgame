package com.aboardgame.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aboardgame.client.CellState;

public class CellStateTest {

    @Test
    public void creation() {
        assertNotNull(CellState.EMPTY);
        assertNotNull(CellState.CROSS);
        assertNotNull(CellState.RING);
    }
}
