package com.danishcaptain.games.hnefatafl.model.domain;

import android.graphics.Color;

public interface Defender {
    int DEFAULT_COLOR = Color.LTGRAY;
    int DEFAULT_TEXT_COLOR = Color.BLACK;

    int getBoardX();
    int getBoardY();

    void kill();
}

