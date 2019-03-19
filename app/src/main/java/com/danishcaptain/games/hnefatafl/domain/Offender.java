package com.danishcaptain.games.hnefatafl.domain;

import android.graphics.Color;

public class Offender extends Piece {
    private static final String DEFAULT_TEXT = "O";
    private static final int DEFAULT_COLOR = Color.BLACK;
    private static final int DEFAULT_TEXT_COLOR = Color.WHITE;

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
