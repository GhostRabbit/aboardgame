package com.aboardgame.client;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.google.gwt.event.dom.client.ClickEvent;

public class TicTacToePresenterTest {

    @Test
    public void creation() {
        TicTacToeBoard board = mock(TicTacToeBoard.class);
        assertNotNull(new TicTacToePresenter(board));
    }
    
    @Test
    public void cellClickShouldIncrementState() {
        TicTacToeCell cell = mock(TicTacToeCell.class);
        ClickEvent event = mock(ClickEvent.class);
        when(event.getSource()).thenReturn(cell);
        new TicTacToePresenter(null).onCellClick(event);
        verify(cell).setState(CellState.CROSS);
    }
    
    @Test
    public void initialCellStateShouldBeEmpty() {
        TicTacToeCell cell = mock(TicTacToeCell.class);
        TicTacToePresenter presenter = new TicTacToePresenter(null);
        presenter.initCell(cell);
        verify(cell).setState(CellState.EMPTY);
    }
    
    @Test
    public void firstThreeStatesShouldDiffer() {
        TicTacToePresenter presenter = new TicTacToePresenter(null);
        
    }

}
