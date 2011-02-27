package com.aboardgame.client;

import com.aboardgame.shared.BoardState;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("gameService")
public interface GameService extends RemoteService {

    public BoardState getBoardState(String gameId);
}
