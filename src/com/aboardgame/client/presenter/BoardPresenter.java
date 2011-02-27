package com.aboardgame.client.presenter;

import com.aboardgame.client.GameServiceAsync;
import com.aboardgame.client.event.MoveEvent;
import com.aboardgame.client.view.BoardView;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

public class BoardPresenter implements Presenter, BoardView.Presenter {

    private final GameServiceAsync rpcService;
    private final HandlerManager eventBus;
    private final BoardView view;

    public BoardPresenter(GameServiceAsync rpcService, HandlerManager eventBus, BoardView view) {
        this.rpcService = rpcService;
        this.eventBus = eventBus;
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void onCellClicked() {
        eventBus.fireEvent(new MoveEvent());
    }

    public void go(final HasWidgets container) {
        container.clear();
        container.add(view.asWidget());
    }
}
