package com.aboardgame.client;

import com.google.gwt.user.client.ui.Image;

public class TicTacToeCellWidget extends Image implements TicTacToeCell {

    public TicTacToeCellWidget(int id) {
        setStylePrimaryName("TicTacToeCell");
    }

    @Override
    public void setState(CellState state) {
        setStyleDependentName(state.toString(), true);
    }
}
