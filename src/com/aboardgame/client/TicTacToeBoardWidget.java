package com.aboardgame.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TicTacToeBoardWidget extends Composite implements TicTacToeBoard {

    private Panel panel;

    public TicTacToeBoardWidget(TicTacToeModel model) {
        createComponents(model);
        initWidget(panel);
        setStylePrimaryName("TicTacToeBoard");
    }

    private void createComponents(TicTacToeModel model) {
        final TicTacToePresenter presenter = new TicTacToePresenter(model);
        panel = new VerticalPanel();
        for (int row = 0; row < 3; row++) {
            Panel hPanel = new HorizontalPanel();
            panel.add(hPanel);
            for (int col = 0; col < 3; col++) {
                int index = col + row * 3;
                TicTacToeCell cell = new TicTacToeCellWidget(index);
                presenter.initCell(cell);
                hPanel.add(cell);
            }
        }
    }
}
