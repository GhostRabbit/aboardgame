package com.aboardgame.client;

import com.aboardgame.shared.BoardState;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GameServiceAsync {
    
    public void getBoard(String id, AsyncCallback<BoardState> callback);
}
