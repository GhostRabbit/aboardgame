package com.aboardgame.client;

import com.aboardgame.client.view.BoardView;
import com.aboardgame.client.view.BoardViewImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Aboardgame implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
	    HandlerManager eventBus = new HandlerManager(null);
	    AppController appViewer = new AppController(eventBus);
	    appViewer.go(RootPanel.get());
	    
        BoardModel model = new BoardModel();
        model.fakeComplexState();
        BoardView board = new BoardViewImpl(model);
        RootPanel.get("boardContainer").add(board);
	}
}
