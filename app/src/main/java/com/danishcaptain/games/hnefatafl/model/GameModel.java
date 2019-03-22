package com.danishcaptain.games.hnefatafl.model;

import android.app.Activity;

public final class GameModel {
    private static GameModel singleton;
    private final BoardModel boardModel;
    private final PiecesModel piecesModel;
    private final PlayerModel playerModel;

    private GameModel() {
        boardModel = new BoardModel();
        piecesModel = new PiecesModel(boardModel);
        playerModel = new PlayerModel(boardModel);
    }

    public void init(Activity activity) {
        boardModel.init(activity);
        piecesModel.init(activity);
        playerModel.init(activity);
    }

    public synchronized static GameModel getInstance() {
        if (singleton == null) {
            singleton = new GameModel();
        }
        return singleton;
    }

}
