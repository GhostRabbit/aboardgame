package com.aboardgame.server;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

	private TicTacToe game;
	private Player playerOne;
	private Player playerTwo;

	@Before
	public void setUp() {
		playerOne = new Player("Mattias");
		playerTwo = new Player("Joakim");
		game = new TicTacToe(playerOne, playerTwo);
	}

	@Test
	public void gameShouldRememberPlayers() {
		ArrayList<Player> players = game.getPlayers();
		assertNotNull(players);
		assertTrue(players.contains(playerOne));
		assertTrue(players.contains(playerTwo));
		assertEquals("Wrong number of players", 2, players.size());
	}
	
	@Test (expected=Exception.class)
	public void playerTwoShouldNotBeAllowedToStart() throws Exception {
		game.mark(playerTwo, 0,0);
	}
	
	@Test
	public void playerOneShouldBeAllowedToStart() throws Exception {
		game.mark(playerOne, 0,0);
	}

	@Test (expected=Exception.class)
	public void playerOneShallNotMakeSecondMove() throws Exception {
		game.mark(playerOne, 0,0);
		game.mark(playerOne, 0,0);
	}
	
	@Test
	public void playerTwoShallNotMakeThirdMove() throws Exception {
		game.mark(playerOne, 0,0);
		game.mark(playerTwo, 0,0);
		try {
			game.mark(playerTwo, 0,0);
			fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void newBoardShouldBeEmpty() {
//		Board board = game.getBoard();
//		assertTrue(board.isEmpty());
	}
}