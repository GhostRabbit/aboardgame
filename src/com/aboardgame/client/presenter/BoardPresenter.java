package com.aboardgame.client.presenter;

import com.aboardgame.client.BoardModel;
import com.aboardgame.client.view.CellView;
import com.aboardgame.shared.CellState;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class BoardPresenter {

    private BoardModel model;
    
    public BoardPresenter(BoardModel model) {
        this.model = model;
    }

    public void onCellClick(ClickEvent event) {
        CellView cell = (CellView) event.getSource();
        cell.showState(model.nextState(cell));
    }

    public void initCell(CellView cell) {
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
