package com.danishcaptain.games.hnefatafl.model;

import android.graphics.Color;
import android.widget.TextView;

import com.danishcaptain.games.hnefatafl.model.domain.Defender;
import com.danishcaptain.games.hnefatafl.model.domain.DefensePlayer;
import com.danishcaptain.games.hnefatafl.model.domain.KingPiece;
import com.danishcaptain.games.hnefatafl.model.domain.Offender;
import com.danishcaptain.games.hnefatafl.model.domain.OffensePlayer;
import com.danishcaptain.games.hnefatafl.model.domain.Piece;
import com.danishcaptain.games.hnefatafl.model.domain.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerModel {
    private ArrayList<Offender> offenders = new ArrayList();
    private ArrayList<Defender> defenders = new ArrayList();
    private OffensePlayer op;
    private DefensePlayer dp;
    private Player current;
    private TextView info;
    private boolean gameOver;

    public void init() {
        initPlayer1();
        initPlayer2();
    }

    private void initPlayer1() {
        op = new OffensePlayer();
        current = op;
        op.setCurrent(true);
        for (Offender t : offenders) {
            op.register((Piece) t);
        }
    }

    private void initPlayer2() {
        dp = new DefensePlayer();
        for (Defender t : defenders) {
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

    public void register(Offender o) {
        offenders.add(o);
    }

    public void register(Defender d) {
        defenders.add(d);
    }

    public void register(KingPiece k) {
        defenders.add(k);
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

    public List<Offender> getOffenders() {
        return offenders;
    }

    public List<Defender> getDefenders() {
        return defenders;
    }
}
