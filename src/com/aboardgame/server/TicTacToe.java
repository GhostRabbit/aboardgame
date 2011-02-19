package com.aboardgame.server;

import java.util.ArrayList;

public class TicTacToe {

	private ArrayList<Player> players;
	private int currentPlayerIndex;

	public TicTacToe(Player playerOne, Player playerTwo) {
		players = new ArrayList<Player>();
		players.add(playerOne);
		players.add(playerTwo);
		currentPlayerIndex = 0;
	}

	public TicTacToe() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void mark(Player player, int i, int j) throws Exception {
		if (player != players.get(currentPlayerIndex)) {
			throw new Exception("Not your turn");
		}
		currentPlayerIndex++;
	}
}
