package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;

import com.danishcaptain.games.hnefatafl.model.domain.KingPiece;
import com.danishcaptain.games.hnefatafl.model.domain.Piece;

public class CornerCastle extends MoveLocation implements Castle {

    public CornerCastle(Context context, int x, int y) {
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
        return piece instanceof KingPiece;
    }

    @Override
    public boolean jeopardyPiece() {
        return true;
    }
}
