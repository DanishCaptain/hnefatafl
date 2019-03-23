package com.danishcaptain.games.hnefatafl.model;

import com.danishcaptain.games.hnefatafl.model.domain.DefensePlayer;
import com.danishcaptain.games.hnefatafl.model.domain.OffensePlayer;

class PlayerModel {
    private final BoardModel board;

    PlayerModel(BoardModel board) {
        this.board = board;
    }

    public void init() {
        initPlayer1();
        initPlayer2();
    }

    private void initPlayer1() {
        OffensePlayer op = new OffensePlayer();
        board.register(op);
        board.setCurrent(op);
    }

    private void initPlayer2() {
        DefensePlayer dp = new DefensePlayer();
        board.register(dp);
    }
}
