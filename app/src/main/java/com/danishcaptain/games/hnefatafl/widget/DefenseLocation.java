package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

public class DefenseLocation extends MoveLocation {
    static final String DEFAULT_TEXT = "";
    static final int DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_TEXT_COLOR = Color.BLACK;

    public DefenseLocation(Context context) {
        super(context);
        init();
    }

    private void init() {
        setText(DEFAULT_TEXT);
        setBackgroundColor(DEFAULT_COLOR);
    }

    public DefenseLocation(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DefenseLocation(Context context, AttributeSet attrs, int defStyleAttr) {
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
