package com.danishcaptain.games.hnefatafl.model.domain;

import android.graphics.Color;

public interface Offender {
    int DEFAULT_COLOR = Color.BLACK;
    int DEFAULT_TEXT_COLOR = Color.WHITE;

    int getBoardX();
    int getBoardY();

    void kill();
}
