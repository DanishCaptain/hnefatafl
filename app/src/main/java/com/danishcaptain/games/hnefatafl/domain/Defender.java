package com.danishcaptain.games.hnefatafl.domain;

import android.graphics.Color;

public class Defender extends Piece {
    private static final String DEFAULT_TEXT = "D";
    private static final int DEFAULT_COLOR = King.DEFAULT_COLOR;
    private static final int DEFAULT_TEXT_COLOR = King.DEFAULT_TEXT_COLOR;

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
