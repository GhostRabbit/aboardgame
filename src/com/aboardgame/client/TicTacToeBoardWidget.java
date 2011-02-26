package com.aboardgame.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TicTacToeBoardWidget extends Composite implements TicTacToeBoard {

    private Panel panel;

    public TicTacToeBoardWidget() {
        createComponents();
        initWidget(panel);
        setStylePrimaryName("TicTacToeBoard");
    }

    private void createComponents() {
        ClickHandler clickHandler = createClickHandler();
        panel = new VerticalPanel();
        for (int row = 0; row < 3; row++) {
            Panel hPanel = new HorizontalPanel();
            panel.add(hPanel);
            for (int col = 0; col < 3; col++) {
                int index = col + row * 3;
                TicTacToeCell cell = createCell(index, clickHandler);
                hPanel.add(cell);
            }
        }
    }

    private TicTacToeCell createCell(int index, ClickHandler clickHandler) {
        TicTacToeCell cell = new TicTacToeCellWidget(index);
        cell.addClickHandler(clickHandler);
        return cell;
    }

    private ClickHandler createClickHandler() {
        final TicTacToePresenter presenter = new TicTacToePresenter(this);
        return new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                presenter.onCellClick(event);
            }
        };
    }
}
