package com.aboardgame.client.view;

import com.aboardgame.client.presenter.BoardPresenter;
import com.aboardgame.shared.BoardState;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class BoardViewImpl extends Composite implements BoardView {

    private Panel panel;
    private BoardPresenter presenter;
    private BoardState state;

    interface BoardViewUiBinder extends UiBinder<Widget, BoardViewImpl> {
    }

    private static BoardViewUiBinder uiBinder = GWT.create(BoardViewUiBinder.class);

    public BoardViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(BoardPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setState(BoardState state) {
        this.state = state;
    }
}
