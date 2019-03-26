package com.danishcaptain.games.hnefatafl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.danishcaptain.games.hnefatafl.model.GameModel;
import com.danishcaptain.games.hnefatafl.widget.BannerAdView;

public class MainActivity extends AppCompatActivity {

    private TextView titleTextView;
    private BannerAdView adTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GameModel.getInstance().init(this);

        titleTextView = findViewById(R.id.titleText);
        TextView player1TextView = findViewById(R.id.player1Text);
        GameModel.getInstance().getPlayerInstance().initOffensePlayer(player1TextView);

        TextView player2TextView = findViewById(R.id.player2Text);
        GameModel.getInstance().getPlayerInstance().initDefensePlayer(player2TextView);

        TextView infoTextView = findViewById(R.id.infoText);
        GameModel.getInstance().getPlayerInstance().initInfo(infoTextView);


        adTextView = findViewById(R.id.ad);
        adTextView.setText("Frogs");
    }

}
