package com.aboardgame.server;

import static org.junit.Assert.*;

import org.junit.Test;


public class GameServiceImplTest {
    
    @Test
    public void getBoardGivesDataBack() {
        assertNotNull(new GameServiceImpl().getBoard(null));
    }

}
