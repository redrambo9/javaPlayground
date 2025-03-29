package com.fundamentals.java.designpatterns.snakeladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game() {
        initialize();
    }

    public void initialize() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

}
