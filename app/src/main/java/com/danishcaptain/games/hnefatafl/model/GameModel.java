package com.danishcaptain.games.hnefatafl.model;

import android.app.Activity;

public final class GameModel {
    private static GameModel singleton;
    private final PlayerModel playerModel;
    private final BoardModel boardModel;
    private final PiecesModel piecesModel;

    private GameModel() {
        playerModel = new PlayerModel();
        boardModel = new BoardModel(playerModel);
        piecesModel = new PiecesModel(boardModel);
    }

    public void init(Activity activity) {
        boardModel.init(activity);
        piecesModel.init();
        playerModel.init();
    }

    public synchronized static GameModel getInstance() {
        if (singleton == null) {
            singleton = new GameModel();
        }
        return singleton;
    }

    public PlayerModel getPlayerInstance() {
        return playerModel;
    }
}
