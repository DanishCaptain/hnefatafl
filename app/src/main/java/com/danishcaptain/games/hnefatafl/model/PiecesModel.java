package com.danishcaptain.games.hnefatafl.model;

import com.danishcaptain.games.hnefatafl.model.domain.DefensePiece;
import com.danishcaptain.games.hnefatafl.model.domain.KingPiece;
import com.danishcaptain.games.hnefatafl.model.domain.OffensePiece;
import com.danishcaptain.games.hnefatafl.widget.MoveLocation;

class PiecesModel {
    private final BoardModel board;

    PiecesModel(BoardModel board) {
        this.board = board;
    }

    public void init() {
        initRow1();
        initRow2();
        initRow3();
        initRow4();
        initRow5();
        initRow6();
        initRow7();
        initRow8();
        initRow9();
        initRow10();
        initRow11();
    }

    private void initRow1() {
        int row = 0;
        initOffensePiece(board.lookupLocation(row, 3));
        initOffensePiece(board.lookupLocation(row, 4));
        initOffensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 6));
        initOffensePiece(board.lookupLocation(row, 7));
    }

    private void initOffensePiece(MoveLocation location) {
        OffensePiece o = new OffensePiece();
        board.register(o);
        location.add(o);
    }

    private void initDefensePiece(MoveLocation location) {
        DefensePiece d = new DefensePiece();
        board.register(d);
        location.add(d);
    }

    private void initKingPiece(MoveLocation location) {
        KingPiece k = new KingPiece();
        board.register(k);
        location.add(k);
    }

    private void initRow2() {
        int row = 1;
        initOffensePiece(board.lookupLocation(row, 4));
        initOffensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 6));
    }

    private void initRow3() {
//        int row = 2;
    }

    private void initRow4() {
        int row = 3;
        initOffensePiece(board.lookupLocation(row, 0));
        initDefensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow5() {
        int row = 4;
        initOffensePiece(board.lookupLocation(row, 0));
        initOffensePiece(board.lookupLocation(row, 1));
        initDefensePiece(board.lookupLocation(row, 4));
        initDefensePiece(board.lookupLocation(row, 5));
        initDefensePiece(board.lookupLocation(row, 6));
        initOffensePiece(board.lookupLocation(row, 9));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow6() {
        int row = 5;
        initOffensePiece(board.lookupLocation(row, 0));
        initOffensePiece(board.lookupLocation(row, 1));
        initDefensePiece(board.lookupLocation(row, 3));
        initDefensePiece(board.lookupLocation(row, 4));
        initKingPiece(board.lookupLocation(row, 5));
        initDefensePiece(board.lookupLocation(row, 6));
        initDefensePiece(board.lookupLocation(row, 7));
        initOffensePiece(board.lookupLocation(row, 9));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow7() {
        int row = 6;
        initOffensePiece(board.lookupLocation(row, 0));
        initOffensePiece(board.lookupLocation(row, 1));
        initDefensePiece(board.lookupLocation(row, 4));
        initDefensePiece(board.lookupLocation(row, 5));
        initDefensePiece(board.lookupLocation(row, 6));
        initOffensePiece(board.lookupLocation(row, 9));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow8() {
        int row = 7;
        initOffensePiece(board.lookupLocation(row, 0));
        initDefensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow9() {
//        int row = 8;
    }

    private void initRow10() {
        int row = 9;
        initOffensePiece(board.lookupLocation(row, 4));
        initOffensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 6));
    }

    private void initRow11() {
        int row = 10;
        initOffensePiece(board.lookupLocation(row, 3));
        initOffensePiece(board.lookupLocation(row, 4));
        initOffensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 6));
        initOffensePiece(board.lookupLocation(row, 7));
    }

}
