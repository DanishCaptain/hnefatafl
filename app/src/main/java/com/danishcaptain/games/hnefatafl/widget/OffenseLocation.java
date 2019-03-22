package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;
import android.graphics.Color;

import com.danishcaptain.games.hnefatafl.model.domain.Piece;

public class OffenseLocation extends MoveLocation {
    static final String DEFAULT_TEXT = "";
    static final int DEFAULT_COLOR = Color.GREEN;
    private static final int DEFAULT_TEXT_COLOR = Color.WHITE;

    public OffenseLocation(Context context, int x, int y) {
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
}
