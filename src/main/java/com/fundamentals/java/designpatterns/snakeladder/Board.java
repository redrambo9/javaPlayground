package com.fundamentals.java.designpatterns.snakeladder;


public class Board {

    Cell[][] cells;

    Board(int boardSize, int noOfSnakes, int noOfLadders) {
        initializeCells(boardSize);
    }

    public void initializeCells(int boardSize) {

        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }
}
