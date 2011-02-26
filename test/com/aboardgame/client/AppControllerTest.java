package com.aboardgame.client;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.google.gwt.user.client.ui.HasWidgets;


public class AppControllerTest {

    @Test
    public void valueChangeDoesNothing() {
        new AppController(null).onValueChange(null);
    }
    
    @Test
    public void goRemembersContainer() {
        HasWidgets container = mock(HasWidgets.class);
        AppController appViewer = new AppController(null);
        appViewer.go(container);
        assertEquals(container, appViewer.getContainer());
    }
}
