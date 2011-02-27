package com.aboardgame.client.view;

import com.aboardgame.client.presenter.MovePresenter;
import com.aboardgame.shared.BoardState;
import com.google.gwt.user.client.ui.IsWidget;

public interface BoardView extends IsWidget {

    public interface Presenter<T> {
        public void onCellClicked();
    }

    void setPresenter(MovePresenter presenter);

    void setState(BoardState state);

}