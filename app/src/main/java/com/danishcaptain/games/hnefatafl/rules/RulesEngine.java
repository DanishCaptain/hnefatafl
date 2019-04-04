package com.danishcaptain.games.hnefatafl.rules;

import com.danishcaptain.games.hnefatafl.model.GameModel;

public final class RulesEngine {
    private static RulesEngine singleton;
    private final RulesSet rules;
    private GameModel gameModel;

    private RulesEngine() {
        rules = new FetlarRules();
    }

    public void initialize(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public RulesSet getSet() {
        return rules;
    }

    public synchronized static RulesEngine getInstance() {
        if (singleton == null) {
            singleton = new RulesEngine();
        }
        return singleton;
    }

}
