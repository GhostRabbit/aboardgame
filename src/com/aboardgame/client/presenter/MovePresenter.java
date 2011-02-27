package com.aboardgame.client.presenter;

import com.aboardgame.client.GameServiceAsync;
import com.aboardgame.client.event.MoveEvent;
import com.aboardgame.client.view.BoardView;
import com.aboardgame.shared.BoardState;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;

public class MovePresenter implements Presenter, BoardView.Presenter<BoardState> {

    private final GameServiceAsync rpcService;
    private final HandlerManager eventBus;
    private final BoardView view;
    private final int gameId;

    public MovePresenter(GameServiceAsync rpcService, HandlerManager eventBus, BoardView view, int gameId) {
        this.rpcService = rpcService;
        this.eventBus = eventBus;
        this.view = view;
        this.gameId = gameId;
        this.view.setPresenter(this);
    }

    @Override
    public void onCellClicked() {
        eventBus.fireEvent(new MoveEvent());
    }

    public void go(final HasWidgets container) {
        container.clear();
        container.add(view.asWidget());
        fetchBoardState();
    }

    private void fetchBoardState() {
        rpcService.getBoardState("" + gameId, new AsyncCallback<BoardState>() {

            @Override
            public void onSuccess(BoardState result) {
                System.out.println("Loaded state: " + result);
                view.setState(result);
            }

            public void onFailure(Throwable caught) {
              Window.alert("Error fetching board state");
            }
          });
    }
    
}
