package com.danishcaptain.games.hnefatafl.model;

import android.content.Context;

import com.danishcaptain.games.hnefatafl.model.domain.Defender;
import com.danishcaptain.games.hnefatafl.model.domain.King;
import com.danishcaptain.games.hnefatafl.model.domain.Offender;
import com.danishcaptain.games.hnefatafl.widget.MoveLocation;

class PiecesModel {
    private final BoardModel board;

    public PiecesModel(BoardModel board) {
        this.board = board;
    }

    public void init(Context context) {
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
        initOffenseLocation(board.lookupLocation(row, 3));
        initOffenseLocation(board.lookupLocation(row, 4));
        initOffenseLocation(board.lookupLocation(row, 5));
        initOffenseLocation(board.lookupLocation(row, 6));
        initOffenseLocation(board.lookupLocation(row, 7));
    }

    private void initOffenseLocation(MoveLocation location) {
        Offender o = new Offender();
        board.register(o);
        location.add(o);
    }

    private void addDefenseLocation(MoveLocation location) {
        Defender d = new Defender();
        board.register(d);
        location.add(d);
    }

    private void addCenterCastle(MoveLocation location) {
        King k = new King();
        board.register(k);
        location.add(k);
    }

    private void initRow2() {
        int row = 1;
        initOffenseLocation(board.lookupLocation(row, 4));
        initOffenseLocation(board.lookupLocation(row, 5));
        initOffenseLocation(board.lookupLocation(row, 6));
    }

    private void initRow3() {
        int row = 2;
    }

    private void initRow4() {
        int row = 3;

        initOffenseLocation(board.lookupLocation(row, 0));
        addDefenseLocation(board.lookupLocation(row, 5));
        initOffenseLocation(board.lookupLocation(row, 10));
    }

    private void initRow5() {
        int row = 4;

        initOffenseLocation(board.lookupLocation(row, 0));
        initOffenseLocation(board.lookupLocation(row, 1));
        addDefenseLocation(board.lookupLocation(row, 4));
        addDefenseLocation(board.lookupLocation(row, 5));
        addDefenseLocation(board.lookupLocation(row, 6));
        initOffenseLocation(board.lookupLocation(row, 9));
        initOffenseLocation(board.lookupLocation(row, 10));
    }

    private void initRow6() {
        int row = 5;

        initOffenseLocation(board.lookupLocation(row, 0));
        initOffenseLocation(board.lookupLocation(row, 1));
        addDefenseLocation(board.lookupLocation(row, 3));
        addDefenseLocation(board.lookupLocation(row, 4));
        addCenterCastle(board.lookupLocation(row, 5));
        addDefenseLocation(board.lookupLocation(row, 6));
        addDefenseLocation(board.lookupLocation(row, 7));
        initOffenseLocation(board.lookupLocation(row, 9));
        initOffenseLocation(board.lookupLocation(row, 10));
    }

    private void initRow7() {
        int row = 6;

        initOffenseLocation(board.lookupLocation(row, 0));
        initOffenseLocation(board.lookupLocation(row, 1));
        addDefenseLocation(board.lookupLocation(row, 4));
        addDefenseLocation(board.lookupLocation(row, 5));
        addDefenseLocation(board.lookupLocation(row, 6));
        initOffenseLocation(board.lookupLocation(row, 9));
        initOffenseLocation(board.lookupLocation(row, 10));
    }

    private void initRow8() {
        int row = 7;

        initOffenseLocation(board.lookupLocation(row, 0));
        addDefenseLocation(board.lookupLocation(row, 5));
        initOffenseLocation(board.lookupLocation(row, 10));
    }

    private void initRow9() {
        int row = 8;
    }

    private void initRow10() {
        int row = 9;

        initOffenseLocation(board.lookupLocation(row, 4));
        initOffenseLocation(board.lookupLocation(row, 5));
        initOffenseLocation(board.lookupLocation(row, 6));
    }

    private void initRow11() {
        int row = 10;

        initOffenseLocation(board.lookupLocation(row, 3));
        initOffenseLocation(board.lookupLocation(row, 4));
        initOffenseLocation(board.lookupLocation(row, 5));
        initOffenseLocation(board.lookupLocation(row, 6));
        initOffenseLocation(board.lookupLocation(row, 7));
    }

}
