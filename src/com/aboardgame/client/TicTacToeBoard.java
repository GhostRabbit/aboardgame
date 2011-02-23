package com.aboardgame.client;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Panel;

public class TicTacToeBoard extends Composite {
    
    private final Panel panel;
    private final Button button;
    
    public TicTacToeBoard() {
        panel = new FlowPanel();
        initWidget(panel);
        
        button = new Button("Press me");
        panel.add(button);
    }
    
    public Button getButton() {
        return button;
    }

    public void addClickHandler(ClickHandler clickHandler) {
        button.addClickHandler(clickHandler);
    }
}
