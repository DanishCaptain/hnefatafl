package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;

import com.danishcaptain.games.hnefatafl.model.domain.Defender;
import com.danishcaptain.games.hnefatafl.model.domain.King;
import com.danishcaptain.games.hnefatafl.model.domain.Piece;

public class CenterCastle extends MoveLocation implements Castle {

    private void init() {
        setText(DEFAULT_TEXT);
        setBackgroundColor(DEFAULT_COLOR);
    }

    public CenterCastle(Context context, int x, int y) {
        super(context, x, y);
        init();
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
        if (piece instanceof King) {
            return true;
        } if (piece instanceof Defender) {
                return true;
        } else {
            return false;
        }
    }
}
