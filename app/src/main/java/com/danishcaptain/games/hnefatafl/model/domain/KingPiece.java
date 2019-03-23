package com.danishcaptain.games.hnefatafl.model.domain;

public class KingPiece extends Piece implements Defender {
    private static final String DEFAULT_TEXT = "K";

    @Override
    public String getDisplayText() {
        return DEFAULT_TEXT;
    }

    @Override
    public int getDisplayColor() {
        return DEFAULT_COLOR;
    }

    @Override
    public int getDisplayTextColor() {
        return DEFAULT_TEXT_COLOR;
    }
}
