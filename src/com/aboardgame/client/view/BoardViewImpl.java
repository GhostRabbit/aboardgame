package com.aboardgame.client.view;

import com.aboardgame.client.presenter.MovePresenter;
import com.aboardgame.shared.BoardState;
import com.aboardgame.shared.CellState;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class BoardViewImpl extends Composite implements BoardView {

    @UiTemplate("BoardViewImpl.ui.xml")
    interface BoardViewUiBinder extends UiBinder<Widget, BoardViewImpl> {}

    private static BoardViewUiBinder uiBinder = GWT.create(BoardViewUiBinder.class);
    
    private Panel panel;
    private MovePresenter presenter;
    private BoardState state;

    @UiField Image cell0;
    @UiField Image cell1;
    @UiField Image cell2;
    @UiField Image cell3;
    @UiField Image cell4;
    @UiField Image cell5;
    @UiField Image cell6;
    @UiField Image cell7;
    @UiField Image cell8;
    
    public BoardViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
        initCellStyle();
    }

    private void initCellStyle() {
        cell0.setStylePrimaryName("TicTacToeCell");
        cell1.setStylePrimaryName("TicTacToeCell");
        cell2.setStylePrimaryName("TicTacToeCell");
        cell3.setStylePrimaryName("TicTacToeCell");
        cell4.setStylePrimaryName("TicTacToeCell");
        cell5.setStylePrimaryName("TicTacToeCell");
        cell6.setStylePrimaryName("TicTacToeCell");
        cell7.setStylePrimaryName("TicTacToeCell");
        cell8.setStylePrimaryName("TicTacToeCell");
    }

    @Override
    public void setPresenter(MovePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setState(BoardState state) {
        this.state = state;
        CellState[] cellStates = state.getCellStates();
        cell0.setStyleDependentName(cellStates[0].toString(), true);
        cell1.setStyleDependentName(cellStates[1].toString(), true);
        cell2.setStyleDependentName(cellStates[2].toString(), true);
        cell3.setStyleDependentName(cellStates[3].toString(), true);
        cell4.setStyleDependentName(cellStates[4].toString(), true);
        cell5.setStyleDependentName(cellStates[5].toString(), true);
        cell6.setStyleDependentName(cellStates[6].toString(), true);
        cell7.setStyleDependentName(cellStates[7].toString(), true);
        cell8.setStyleDependentName(cellStates[8].toString(), true);
    }
    
    public Widget asWidget() {
        return this;
    }
}
