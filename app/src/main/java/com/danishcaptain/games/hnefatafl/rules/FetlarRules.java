package com.danishcaptain.games.hnefatafl.rules;

import com.danishcaptain.games.hnefatafl.model.domain.Board;

public class FetlarRules extends RulesSet {
    @Override
    public Board createBoard() {
        Board b =  new Board(11,11);
        return b;
    }
}
