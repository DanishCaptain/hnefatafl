package com.danishcaptain.games.hnefatafl.model.domain;

import com.danishcaptain.games.hnefatafl.widget.MoveLocation;

public abstract class Piece {
    private MoveLocation location;

    public abstract String getDisplayText();
    public abstract int getDisplayColor();
    public abstract int getDisplayTextColor();

    public void register(MoveLocation location) {
        this.location = location;
    }

    public void deregister() {
        this.location = null;
    }

    public int getBoardX() {
        if (location != null) {
            return location.getBoardX();
        } else {
            return -1;
        }
    }

    public int getBoardY() {
        if (location != null) {
            return location.getBoardY();
        } else {
            return -1;
        }
    }

    public void kill() {
        if (location != null) {
            location.add(null);
            location = null;
        }
    }

    @Override
    public String toString() {
        if (location == null) {
            return getDisplayText();
        } else {
            return getDisplayText()+":"+location;
        }
    }
}
