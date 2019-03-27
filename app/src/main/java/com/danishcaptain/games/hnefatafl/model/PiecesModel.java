package com.danishcaptain.games.hnefatafl.model;

import com.danishcaptain.games.hnefatafl.model.domain.Defender;
import com.danishcaptain.games.hnefatafl.model.domain.DefensePiece;
import com.danishcaptain.games.hnefatafl.model.domain.KingPiece;
import com.danishcaptain.games.hnefatafl.model.domain.Offender;
import com.danishcaptain.games.hnefatafl.model.domain.OffensePiece;
import com.danishcaptain.games.hnefatafl.widget.MoveLocation;

import java.util.ArrayList;
import java.util.List;

class PiecesModel {
    private ArrayList<Offender> offenders = new ArrayList();
    private ArrayList<Defender> defenders = new ArrayList();

    public void init(BoardModel board) {
        initRow1(board);
        initRow2(board);
        initRow3(board);
        initRow4(board);
        initRow5(board);
        initRow6(board);
        initRow7(board);
        initRow8(board);
        initRow9(board);
        initRow10(board);
        initRow11(board);
    }

    private void initRow1(BoardModel board) {
        int row = 0;
        initOffensePiece(board.lookupLocation(row, 3));
        initOffensePiece(board.lookupLocation(row, 4));
        initOffensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 6));
        initOffensePiece(board.lookupLocation(row, 7));
    }

    private void initOffensePiece(MoveLocation location) {
        OffensePiece o = new OffensePiece();
        location.add(o);
        offenders.add(o);
    }

    private void initDefensePiece(MoveLocation location) {
        DefensePiece d = new DefensePiece();
        location.add(d);
        defenders.add(d);
    }

    private void initKingPiece(MoveLocation location) {
        KingPiece k = new KingPiece();
        location.add(k);
        defenders.add(k);
    }

    private void initRow2(BoardModel board) {
        int row = 1;
        initOffensePiece(board.lookupLocation(row, 4));
        initOffensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 6));
    }

    private void initRow3(BoardModel board) {
//        int row = 2;
    }

    private void initRow4(BoardModel board) {
        int row = 3;
        initOffensePiece(board.lookupLocation(row, 0));
        initDefensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow5(BoardModel board) {
        int row = 4;
        initOffensePiece(board.lookupLocation(row, 0));
        initOffensePiece(board.lookupLocation(row, 1));
        initDefensePiece(board.lookupLocation(row, 4));
        initDefensePiece(board.lookupLocation(row, 5));
        initDefensePiece(board.lookupLocation(row, 6));
        initOffensePiece(board.lookupLocation(row, 9));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow6(BoardModel board) {
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

    private void initRow7(BoardModel board) {
        int row = 6;
        initOffensePiece(board.lookupLocation(row, 0));
        initOffensePiece(board.lookupLocation(row, 1));
        initDefensePiece(board.lookupLocation(row, 4));
        initDefensePiece(board.lookupLocation(row, 5));
        initDefensePiece(board.lookupLocation(row, 6));
        initOffensePiece(board.lookupLocation(row, 9));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow8(BoardModel board) {
        int row = 7;
        initOffensePiece(board.lookupLocation(row, 0));
        initDefensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 10));
    }

    private void initRow9(BoardModel board) {
//        int row = 8;
    }

    private void initRow10(BoardModel board) {
        int row = 9;
        initOffensePiece(board.lookupLocation(row, 4));
        initOffensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 6));
    }

    private void initRow11(BoardModel board) {
        int row = 10;
        initOffensePiece(board.lookupLocation(row, 3));
        initOffensePiece(board.lookupLocation(row, 4));
        initOffensePiece(board.lookupLocation(row, 5));
        initOffensePiece(board.lookupLocation(row, 6));
        initOffensePiece(board.lookupLocation(row, 7));
    }

    public void reset(BoardModel board) {
        offenders.clear();
        defenders.clear();
        init(board);
    }

    public List<Offender> getOffenders() {
        return offenders;
    }

    public List<Defender> getDefenders() {
        return defenders;
    }
}
