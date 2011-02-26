package com.aboardgame.client.view;

import com.aboardgame.client.CellState;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.IsWidget;

public interface CellView extends HasClickHandlers, IsWidget {

    int getPosition();

    void showState(CellState state);

}