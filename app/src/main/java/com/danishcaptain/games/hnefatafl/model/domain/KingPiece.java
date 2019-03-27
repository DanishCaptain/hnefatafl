package com.danishcaptain.games.hnefatafl.model.domain;

import android.graphics.Color;

public class KingPiece extends Piece implements Defender {
    private static final String DEFAULT_TEXT = "K";
//    public int DEFAULT_COLOR = Color.rgb(0xff,0xd7,0x00);
    public static final int DEFAULT_COLOR = Color.rgb(0xc0,0xc0,0xc0);

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
