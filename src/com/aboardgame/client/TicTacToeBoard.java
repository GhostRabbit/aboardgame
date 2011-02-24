package com.aboardgame.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TicTacToeBoard extends Composite {

    private final TicTacToeCell[][] cells = new TicTacToeCell[3][3];
    private VerticalPanel panel;

    public TicTacToeBoard() {
        panel = new VerticalPanel();
        initWidget(panel);
        for (int i = 0; i < cells.length; i++) {
            HorizontalPanel hPanel = new HorizontalPanel();
            panel.add(hPanel);
            for (int j = 0; j < cells[i].length; j++) {
                TicTacToeCell cell = new TicTacToeCell();
                hPanel.add(cell);
                cells[i][j] = cell;
            }
        }
    }
    
    public void addStyleName(String styleName) {
        panel.addStyleName(styleName);
    }

    public TicTacToeCell getCell(int row, int col) {
        return cells[row][col];
    }
}
