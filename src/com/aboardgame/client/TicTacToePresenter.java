package com.aboardgame.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class TicTacToePresenter {

    private TicTacToeModel model;
    
    public TicTacToePresenter(TicTacToeModel model) {
        this.model = model;
    }

    public void onCellClick(ClickEvent event) {
        TicTacToeCell cell = (TicTacToeCell) event.getSource();
        cell.showState(model.nextState(cell));
    }

    public void initCell(TicTacToeCell cell) {
        CellState state = model.getState(cell);
        cell.showState(state);
        cell.addClickHandler(createClickHandler());
    }
    
    private ClickHandler createClickHandler() {
        return new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                onCellClick(event);
            }
        };
    }
}
