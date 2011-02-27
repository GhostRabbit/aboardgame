package com.aboardgame.server;

import com.aboardgame.client.GameService;
import com.aboardgame.shared.BoardState;
import com.aboardgame.shared.FakeBoardState;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class GameServiceImpl extends RemoteServiceServlet implements GameService {

    private static final long serialVersionUID = 2356520060416646487L;

    public BoardState getBoardState(String gameId) {
        return new FakeBoardState();
    }
    
}
