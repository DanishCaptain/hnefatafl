package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;

import com.danishcaptain.games.hnefatafl.model.domain.Piece;

public abstract class MoveLocation extends AppCompatButton {
    private final int boardX;
    private final int boardY;
    private Piece piece;
    private boolean active;

    public MoveLocation(Context context, int x, int y) {
        super(context);
        this.boardX = x;
        this.boardY = y;
    }

    public int getBoardX() {
        return boardX;
    }

    public int getBoardY() {
        return boardY;
    }

    @Override
    public final CharSequence getText() {
        if (hasPiece()) {
            setText(getPiece().getDisplayText());
            setTextColor(getPiece().getDisplayTextColor());
        } else {
            setText(getDefaultText());
            setTextColor(getDefaultTextColor());
        }
        setBackgroundColor();
        return super.getText();
    }

    private void setBackgroundColor() {
        if (active) {
            setBackgroundColor(Color.RED);
        } else {
            if (hasPiece()) {
                setBackgroundColor(getPiece().getDisplayColor());
            } else {
                setBackgroundColor(getDefaultColor());
            }
        }
    }

    abstract protected String getDefaultText();
    abstract protected int getDefaultTextColor();
    abstract protected int getDefaultColor();

    public final boolean hasPiece() {
        return piece != null;
    }

    public final Piece getPiece() {
        return piece;
    }

    public void add(Piece piece) {
        if (this.piece != null) {
            this.piece.deregister();
        }
        this.piece = piece;
        if (this.piece != null) {
            this.piece.register(this);
        }
    }

    public void setActive(boolean b) {
        active = b;
        setBackgroundColor();
    }

    public abstract boolean allowsPiece(Piece piece);

    @Override
    public String toString() {
        return boardX+","+boardY;
    }

    public void reset() {
        piece = null;
        active = false;
    }
}
