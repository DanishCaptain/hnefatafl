package com.danishcaptain.games.hnefatafl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.danishcaptain.games.bge.application.ExecuteException;
import com.danishcaptain.games.bge.model.GameEngineModel;
import com.danishcaptain.games.hnefatafl.model.GameModel;
import com.danishcaptain.games.hnefatafl.widget.BannerAdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            GameEngineModel.getInstance().init(this);
        } catch (ExecuteException e) {
            throw new RuntimeException(e);
        }

        GameModel.getInstance().init(this);

        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(GameModel.getInstance());

        TextView player1TextView = findViewById(R.id.player1Text);
        GameModel.getInstance().getPlayerInstance().initOffensePlayer(player1TextView);

        TextView player2TextView = findViewById(R.id.player2Text);
        GameModel.getInstance().getPlayerInstance().initDefensePlayer(player2TextView);

        TextView infoTextView = findViewById(R.id.infoText);
        GameModel.getInstance().getPlayerInstance().initInfo(infoTextView);
    }

}
