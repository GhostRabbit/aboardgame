package com.aboardgame.client.view;

import com.aboardgame.client.presenter.BoardPresenter;
import com.aboardgame.shared.BoardState;
import com.google.gwt.user.client.ui.IsWidget;

public interface BoardView extends IsWidget {

    public interface Presenter {
        public void onCellClicked();
    }

    void setPresenter(BoardPresenter presenter);

    void setState(BoardState state);

}