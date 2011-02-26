package com.aboardgame.client;

import com.google.gwt.user.client.ui.Button;

public class TicTacToeCell extends Button {

    public TicTacToeCell(int id) {
        setStylePrimaryName("TicTacToeCell");
        setText("" + id);
    }
}
