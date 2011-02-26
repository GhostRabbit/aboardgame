package com.aboardgame.client;

import java.io.PrintStream;

public class TicTacToePresenter {

    private final TicTacToeBoard board;

    public TicTacToePresenter(TicTacToeBoard board) {
        this.board = board;
    }

    public void sayHello(PrintStream out) {
        out.println("Mupp");
    }
}
