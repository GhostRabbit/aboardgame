package com.aboardgame.client;

import com.google.gwt.user.client.ui.Image;

public class TicTacToeCellWidget extends Image implements TicTacToeCell {

    private int position;

    public TicTacToeCellWidget(int position) {
        this.position = position;
        setStylePrimaryName("TicTacToeCell");
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void showState(CellState state) {
        setStyleDependentName(state.toString(), true);
    }
}
