package com.danishcaptain.games.hnefatafl.model.domain;

import com.danishcaptain.games.hnefatafl.widget.MoveLocation;

public class Board {
    private final MoveLocation[][] board;

    public Board(int width, int height) {
        board = new MoveLocation[width][height];
    }

    public void set(MoveLocation ml) {
        board[ml.getBoardX()][ml.getBoardY()] = ml;
    }

    public MoveLocation lookupLocation(int row, int col) {
        return board[row][col];
    }

    public void reset() {
        for (MoveLocation[] b1 : board) {
            for (MoveLocation b2 : b1) {
                b2.reset();
            }
        }
    }
}
