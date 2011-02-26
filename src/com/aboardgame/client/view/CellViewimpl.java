package com.aboardgame.client.view;

import com.aboardgame.client.CellState;
import com.google.gwt.user.client.ui.Image;

public class CellViewimpl extends Image implements CellView {

    private int position;

    public CellViewimpl(int position) {
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
