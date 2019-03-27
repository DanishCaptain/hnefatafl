package com.danishcaptain.games.hnefatafl.model;

import android.app.Activity;
import android.view.View;

public final class GameModel implements View.OnClickListener {
    private static GameModel singleton;
    private final PlayerModel playerModel;
    private final BoardModel boardModel;
    private final PiecesModel piecesModel;

    private GameModel() {
        piecesModel = new PiecesModel();
        playerModel = new PlayerModel();
        boardModel = new BoardModel(playerModel, piecesModel);
    }

    public void init(Activity activity) {
        boardModel.init(activity);
        piecesModel.init(boardModel);
        playerModel.init(piecesModel);
    }

    public PlayerModel getPlayerInstance() {
        return playerModel;
    }

    @Override
    public void onClick(View v) {
        boardModel.reset();
        piecesModel.reset(boardModel);
        playerModel.reset(piecesModel);
    }

    public synchronized static GameModel getInstance() {
        if (singleton == null) {
            singleton = new GameModel();
        }
        return singleton;
    }

}
