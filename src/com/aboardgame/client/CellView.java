package com.aboardgame.client;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.IsWidget;

public interface CellView extends HasClickHandlers, IsWidget {

    int getPosition();

    void showState(CellState state);

}