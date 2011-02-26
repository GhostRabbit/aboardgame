package com.aboardgame.client;

import static org.mockito.Mockito.*;

import org.junit.Test;

import com.google.gwt.event.dom.client.ClickEvent;

public class TicTacToePresenterTest {

    @Test
    public void initialCellStateShouldObeyModel() {
        CellView cell = mock(CellView.class);
        BoardModel model = mock (BoardModel.class);
        when(model.getState(cell)).thenReturn(CellState.RING);
        BoardPresenter presenter = new BoardPresenter(model);
        presenter.initCell(cell);
        verify(cell).showState(CellState.RING);
    }
    
    @Test
    public void cellClickShouldShowNextStateFromModel() {
        CellView cell = mock(CellView.class);
        ClickEvent event = mock(ClickEvent.class);
        when(event.getSource()).thenReturn(cell);
        BoardModel model = mock(BoardModel.class);
        when(model.nextState(cell)).thenReturn(CellState.CROSS);
        new BoardPresenter(model).onCellClick(event);
        verify(cell).showState(CellState.CROSS);
    }
}
