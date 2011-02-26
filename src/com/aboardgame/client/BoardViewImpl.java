package com.aboardgame.client;

import com.aboardgame.client.presenter.BoardPresenter;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class BoardViewImpl extends Composite implements BoardView {

    private Panel panel;

    public BoardViewImpl(BoardModel model) {
        createComponents(model);
        initWidget(panel);
        setStylePrimaryName("TicTacToeBoard");
    }

    private void createComponents(BoardModel model) {
        final BoardPresenter presenter = new BoardPresenter(model);
        panel = new VerticalPanel();
        for (int row = 0; row < 3; row++) {
            Panel hPanel = new HorizontalPanel();
            panel.add(hPanel);
            for (int col = 0; col < 3; col++) {
                int index = col + row * 3;
                CellView cell = new CellViewimpl(index);
                presenter.initCell(cell);
                hPanel.add(cell);
            }
        }
    }
}
