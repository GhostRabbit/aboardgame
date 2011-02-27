package com.aboardgame.client.presenter;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.aboardgame.client.GameServiceAsync;
import com.aboardgame.client.event.MoveEvent;
import com.aboardgame.client.view.BoardView;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class MovePresenterTest {

    private BoardView view;
    private MovePresenter presenter;
    private HandlerManager eventBus;
    private GameServiceAsync rpcService;

    @Before
    public void setup() {
        rpcService = mock(GameServiceAsync.class);
        view = mock(BoardView.class);
        eventBus = mock(HandlerManager.class);
        presenter = new MovePresenter(rpcService, eventBus, view, 0);
    }
    
    @Test
    public void movePresenterShouldHookUpWithView() {
        verify(view).setPresenter(presenter);
    }

    @Test
    public void onCellClickedShouldFireAMoveEvent() {
        presenter.onCellClicked();
        verify(eventBus).fireEvent((MoveEvent) anyObject());
    }

    @Test
    public void goShouldClearContainer() {
        HasWidgets container = mock(HasWidgets.class);
        presenter.go(container);
        verify(container).clear();
    }

    @Ignore
    // Can not test widget crap
    @Test
    public void goShouldAddViewToContainer() {
        Widget widget = mock(Widget.class);
        when(view.asWidget()).thenReturn(widget);
        HasWidgets container = mock(HasWidgets.class);
        presenter.go(container);
        verify(container).add(widget);
    }
}
