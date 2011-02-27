package com.aboardgame.client;

import com.aboardgame.client.event.MoveEvent;
import com.aboardgame.client.event.MoveEventHandler;
import com.aboardgame.client.presenter.BoardPresenter;
import com.aboardgame.client.view.BoardView;
import com.aboardgame.client.view.BoardViewImpl;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

public class AppController implements ValueChangeHandler<String> {

    private HasWidgets container;
    private final GameServiceAsync rpcService;
    private final HandlerManager eventBus;
    protected BoardViewImpl boardView;

    public AppController(GameServiceAsync rpcService, HandlerManager eventBus) {
        this.rpcService = rpcService;
        this.eventBus = eventBus;
        bind();
    }

    private void bind() {
        History.addValueChangeHandler(this);
        eventBus.addHandler(MoveEvent.TYPE, new MoveEventHandler() {

            @Override
            public void onMoveEvent(MoveEvent event) {
                doMove();
            }
        });
    }

    private void doMove() {
        History.newItem("move");
    }

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {
        String token = event.getValue();

        if (token != null) {
            if (token.equals("show")) {
                GWT.runAsync(new RunAsyncCallback() {
                    public void onFailure(Throwable caught) {
                    }

                    public void onSuccess() {
                        // lazily initialize our views, and keep them around to
                        // be reused
                        //
                        if (boardView == null) {
                            boardView = new BoardViewImpl();

                        }
                        new BoardPresenter(rpcService, eventBus, boardView).go(container);
                    }
                });
            } else if (token.equals("move")) {
                GWT.runAsync(new RunAsyncCallback() {
                    public void onFailure(Throwable caught) {
                    }

                    public void onSuccess() {
                    }
                });
            }
        }
    }

    public void go(HasWidgets container) {
        this.container = container;
        if ("".equals(History.getToken())) {
            History.newItem("show");
        } else {
            History.fireCurrentHistoryState();
        }
    }

    public HasWidgets getContainer() {
        return container;
    }

}
