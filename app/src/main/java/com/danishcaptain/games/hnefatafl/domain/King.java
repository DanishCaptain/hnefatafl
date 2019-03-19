package com.danishcaptain.games.hnefatafl.domain;

import android.graphics.Color;

import com.danishcaptain.games.hnefatafl.domain.Piece;

public class King extends Piece {
    private static final String DEFAULT_TEXT = "K";
    static final int DEFAULT_COLOR = Color.LTGRAY;
    static final int DEFAULT_TEXT_COLOR = Color.BLACK;

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
