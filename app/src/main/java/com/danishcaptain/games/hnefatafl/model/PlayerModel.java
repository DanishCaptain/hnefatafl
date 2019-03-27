package com.danishcaptain.games.hnefatafl.model;

import android.graphics.Color;
import android.widget.TextView;

import com.danishcaptain.games.hnefatafl.model.domain.Defender;
import com.danishcaptain.games.hnefatafl.model.domain.DefensePlayer;
import com.danishcaptain.games.hnefatafl.model.domain.Offender;
import com.danishcaptain.games.hnefatafl.model.domain.OffensePlayer;
import com.danishcaptain.games.hnefatafl.model.domain.Piece;
import com.danishcaptain.games.hnefatafl.model.domain.Player;

public class PlayerModel {
    private OffensePlayer op;
    private DefensePlayer dp;
    private Player current;
    private TextView info;
    private boolean gameOver;

    public void init(PiecesModel pModel) {
        initPlayer1(pModel);
        initPlayer2(pModel);
    }

    private void initPlayer1(PiecesModel pModel) {
        if (op == null) {
            op = new OffensePlayer();
        }
        current = op;
        op.setCurrent(true);
        for (Offender t : pModel.getOffenders()) {
            op.register((Piece) t);
        }
    }

    private void initPlayer2(PiecesModel pModel) {
        if (dp == null) {
            dp = new DefensePlayer();
        }
        for (Defender t : pModel.getDefenders()) {
            dp.register((Piece) t);
        }
    }

    public void initOffensePlayer(TextView view) {
        op.init(view);
    }

    public void initDefensePlayer(TextView view) {
        dp.init(view);
    }

    public Player getCurrent() {
        return current;
    }

    public void toggleCurrent() {
        if (op == current) {
            current = dp;
            dp.setCurrent(true);
            op.setCurrent(false);
        } else {
            current = op;
            dp.setCurrent(false);
            op.setCurrent(true);
        }
    }

    public void initInfo(TextView info) {
        this.info = info;
    }

    public void offenseWins() {
        gameOver = true;
        info.setBackgroundColor(Color.RED);
        info.setText(op.getName());
    }

    public void defenseWins() {
        gameOver = true;
        info.setBackgroundColor(Color.RED);
        info.setText(dp.getName());
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void reset(PiecesModel pModel) {
        gameOver = false;
        info.setBackgroundColor(Color.WHITE);
        info.setText("");
        dp.setCurrent(false);
        op.setCurrent(false);
        init(pModel);
    }
}
