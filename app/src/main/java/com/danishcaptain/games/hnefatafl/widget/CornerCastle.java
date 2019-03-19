package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

public class CornerCastle extends MoveLocation implements Castle {

    public CornerCastle(Context context) {
        super(context);
        init();
    }

    private void init() {
        setText(DEFAULT_TEXT);
        setBackgroundColor(DEFAULT_COLOR);
    }

    public CornerCastle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CornerCastle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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

}
