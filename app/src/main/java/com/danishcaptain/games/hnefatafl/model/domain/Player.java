package com.danishcaptain.games.hnefatafl.model.domain;

import android.graphics.Color;
import android.widget.TextView;

import com.danishcaptain.games.hnefatafl.widget.MoveLocation;

import java.util.ArrayList;

public abstract class Player {
    private ArrayList<Piece> pieces = new ArrayList();
    private final String name;
    private MoveLocation active;
    private TextView view;
    private boolean current;

    public Player(String name) {
        this.name = name;
    }

    public void register(Piece p) {
        pieces.add(p);
    }

    public boolean isMine(Piece p) {
        return pieces.contains(p);
    }

    public void setActive(MoveLocation p) {
        active = p;
    }

    public MoveLocation getActive() {
        return active;
    }

    public boolean hasActive() {
        return active != null;
    }

    public final void init(TextView view) {
        this.view = view;
        view.setText(name);
        makePretty();
    }

    private void makePretty() {
        if (view != null) {
            if (current) {
                view.setBackgroundColor(Color.RED);
            } else {
                view.setBackgroundColor(Color.WHITE);
            }
        }
    }

    public void setCurrent(boolean b) {
        current = b;
        makePretty();
    }

    public String getName() {
        return name;
    }
}
