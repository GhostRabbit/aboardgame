package com.aboardgame.client;

import static org.mockito.Mockito.*;

import org.junit.Test;

import com.google.gwt.event.dom.client.ClickEvent;

public class TicTacToePresenterTest {

    @Test
    public void initialCellStateShouldObeyModel() {
        TicTacToeCell cell = mock(TicTacToeCell.class);
        TicTacToeModel model = mock (TicTacToeModel.class);
        when(model.getState(cell)).thenReturn(CellState.RING);
        TicTacToePresenter presenter = new TicTacToePresenter(model);
        presenter.initCell(cell);
        verify(cell).showState(CellState.RING);
    }
    
    @Test
    public void cellClickShouldShowNextStateFromModel() {
        TicTacToeCell cell = mock(TicTacToeCell.class);
        ClickEvent event = mock(ClickEvent.class);
        when(event.getSource()).thenReturn(cell);
        TicTacToeModel model = mock(TicTacToeModel.class);
        when(model.nextState(cell)).thenReturn(CellState.CROSS);
        new TicTacToePresenter(model).onCellClick(event);
        verify(cell).showState(CellState.CROSS);
    }
}
