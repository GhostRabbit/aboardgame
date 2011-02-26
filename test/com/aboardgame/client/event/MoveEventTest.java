package com.aboardgame.client.event;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;


public class MoveEventTest {

    @Test
    public void getAssociatedTypeIsNotNull() {
        assertNotNull(new MoveEvent().getAssociatedType());
    }
    
    @Test
    public void dispatchForwardsToHandler() {
        MoveEventHandler handler = mock(MoveEventHandler.class);
        MoveEvent event = new MoveEvent();
        event.dispatch(handler);
        verify(handler).onMoveEvent(event);
    }
}
