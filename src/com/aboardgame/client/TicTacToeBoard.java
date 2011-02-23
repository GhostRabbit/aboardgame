package com.aboardgame.client;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TicTacToeBoard extends Composite {

    private final Button[][] buttons = new Button[3][3];

    public TicTacToeBoard() {
        VerticalPanel vPanel = new VerticalPanel();
        initWidget(vPanel);
        for (int i = 0; i < buttons.length; i++) {
            HorizontalPanel hPanel = new HorizontalPanel();
            vPanel.add(hPanel);
            for (int j = 0; j < buttons[i].length; j++) {
                String label = "" + (i * buttons.length + j);
                Button button = new Button(label);
                buttons[i][j] = button;
                button.setSize("50px", "50px");
                hPanel.add(button);
            }
        }
    }

    public void addClickHandler(ClickHandler handler) {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j].addClickHandler(handler);
            }
        }
    }
}
