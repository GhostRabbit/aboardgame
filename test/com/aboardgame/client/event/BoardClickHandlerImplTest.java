package com.aboardgame.client.event;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.gwt.event.dom.client.ClickHandler;


public class BoardClickHandlerImplTest {

    @Test
    public void testCreation() {
        assertNotNull(new BoardClickHandlerImpl());
    }
    
    @Test
    public void testImplementsBoardClickHandler() {
        assertTrue(new BoardClickHandlerImpl() instanceof ClickHandler);
    }
}
