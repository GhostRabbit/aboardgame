package com.aboardgame.client;

import com.google.gwt.event.dom.client.ClickEvent;

public class TicTacToePresenter {

    private TicTacToeModel model = new TicTacToeModel(); //To be injected
    
    private TicTacToeBoard board;

    public TicTacToePresenter(TicTacToeBoard board) {
        this.board = board;
    }

    public void onCellClick(ClickEvent event) {
        ((TicTacToeCell) event.getSource()).setState(CellState.CROSS);
    }

    public void initCell(TicTacToeCell cell) {
        cell.setState(CellState.EMPTY);
    }
}
