package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.danishcaptain.games.hnefatafl.domain.Piece;

abstract class MoveLocation extends AppCompatButton {
    private Piece piece;

    public MoveLocation(Context context) {
        super(context);
    }

    public MoveLocation(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MoveLocation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public final CharSequence getText() {
        if (hasPiece()) {
            setText(getPiece().getDisplayText());
            setTextColor(getPiece().getDisplayTextColor());
            setBackgroundColor(getPiece().getDisplayColor());
        } else {
            setText(getDefaultText());
            setTextColor(getDefaultTextColor());
            setBackgroundColor(getDefaultColor());
        }
        return super.getText();
    }

    abstract protected String getDefaultText();
    abstract protected int getDefaultTextColor();
    abstract protected int getDefaultColor();

    protected final boolean hasPiece() {
        return piece != null;
    }

    protected final Piece getPiece() {
        return piece;
    }

    public void add(Piece piece) {
        this.piece = piece;
    }
}
