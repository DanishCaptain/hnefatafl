package com.danishcaptain.games.hnefatafl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.danishcaptain.games.hnefatafl.model.GameModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GameModel.getInstance().init(this);

    }

}
