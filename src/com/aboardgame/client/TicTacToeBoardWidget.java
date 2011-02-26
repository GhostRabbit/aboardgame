package com.aboardgame.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TicTacToeBoardWidget extends Composite implements TicTacToeBoard {

    private final TicTacToeCell[] cells = new TicTacToeCell[3 * 3];
    private Panel panel;

    public TicTacToeBoardWidget() {
        createAndLayoutComponents();
        createPresenter();
        initWidget(panel);
        addStyleName("TicTacToeBoard");
    }

    private void createAndLayoutComponents() {
        panel = new VerticalPanel();
        for (int row = 0; row < 3; row++) {
            Panel hPanel = new HorizontalPanel();
            panel.add(hPanel);
            for (int col = 0; col < 3; col++) {
                int index = col + row * 3;
                TicTacToeCell cell = new TicTacToeCell(index);
                hPanel.add(cell);
                cells[index] = cell;
            }
        }
    }

    private void createPresenter() {
        final TicTacToePresenter presenter = new TicTacToePresenter(this);
        ClickHandler clickHandler = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                presenter.sayHello(System.out);
            }
        };
        for (int i = 0; i < 9; i++) {
            cells[i].addClickHandler(clickHandler);
        }
    }
    
//    public TicTacToeCell getCell(int index) {
//        return cells[index];
//    }
}
