package com.aboardgame.client;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.PrintStream;

import org.junit.Test;

public class TicTacToePresenterTest {

    @Test
    public void creation() {
        TicTacToeBoard board = mock(TicTacToeBoard.class);
        assertNotNull(new TicTacToePresenter(board));
    }
    
    @Test
    public void sayHello() {
        PrintStream out = mock(PrintStream.class);
        new TicTacToePresenter(null).sayHello(out);
        verify(out).println("Mupp");
    }

}
