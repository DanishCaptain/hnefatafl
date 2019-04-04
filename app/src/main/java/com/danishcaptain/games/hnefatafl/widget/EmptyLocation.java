package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;
import android.graphics.Color;

import com.danishcaptain.games.hnefatafl.model.domain.Piece;

public class EmptyLocation extends MoveLocation {
    static final String DEFAULT_TEXT = "";
    //public static final int DEFAULT_COLOR = 0xebd5b3;
    public static final int DEFAULT_COLOR = Color.rgb(0x99,0xbd,0x4b);

    private static final int DEFAULT_TEXT_COLOR = Color.BLACK;

    public EmptyLocation(Context context, int x, int y) {
        super(context, x, y);
        init();
    }

    private void init() {
        setText(DEFAULT_TEXT);
        setBackgroundColor(DEFAULT_COLOR);
    }

    @Override
    protected String getDefaultText() {
        return DEFAULT_TEXT;
    }

    @Override
    protected int getDefaultTextColor() {
        return DEFAULT_TEXT_COLOR;
    }

    @Override
    protected int getDefaultColor() {
        return DEFAULT_COLOR;
    }

    @Override
    public boolean allowsPiece(Piece piece) {
        return true;
    }

    @Override
    public boolean jeopardyPiece() {
        return false;
    }
}
