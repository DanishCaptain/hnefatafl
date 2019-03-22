package com.danishcaptain.games.hnefatafl.model.domain;

import com.danishcaptain.games.hnefatafl.widget.MoveLocation;

import java.util.ArrayList;

public abstract class Player {
    private ArrayList<Piece> pieces = new ArrayList();
    private MoveLocation active;

    public void register(Piece p) {
        pieces.add(p);
    }

    public boolean isMine(Piece p) {
        return pieces.contains(p);
    }

    public void setActive(MoveLocation p) {
        active = p;
    }

    public MoveLocation getActive() {
        return active;
    }

    public boolean hasActive() {
        return active != null;
    }
}
