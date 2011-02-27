package com.aboardgame.client.presenter;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Ignore;
import org.junit.Test;

import com.aboardgame.client.event.MoveEvent;
import com.aboardgame.client.view.BoardView;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class BoardPresenterTest {

    @Test
    public void boardPresenterShouldHookUpWithView() {
        BoardView view = mock(BoardView.class);
        BoardPresenter presenter = new BoardPresenter(null, null, view);
        verify(view).setPresenter(presenter);
    }
    
    @Test
    public void onCellClickedShouldFireAMoveEvent() {
        BoardView view = mock(BoardView.class);
        HandlerManager eventBus = mock(HandlerManager.class);
        new BoardPresenter(null, eventBus, view).onCellClicked();
        verify(eventBus).fireEvent((MoveEvent) anyObject());
    }
    
    @Test
    public void goShouldClearContainer() {
        BoardView view = mock(BoardView.class);
        HasWidgets container = mock(HasWidgets.class);
        new BoardPresenter(null, null, view).go(container);
        verify(container).clear();
    }

    @Ignore //Can not test widget crap
    @Test
    public void goShouldAddViewToContainer() {
        BoardView view = mock(BoardView.class);
        Widget widget = mock(Widget.class);
        when(view.asWidget()).thenReturn(widget);
        HasWidgets container = mock(HasWidgets.class);
        new BoardPresenter(null, null, view).go(container);
        verify(container).add(widget);
    }
}
