package com.danishcaptain.games.hnefatafl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.danishcaptain.games.hnefatafl.domain.Defender;
import com.danishcaptain.games.hnefatafl.domain.King;
import com.danishcaptain.games.hnefatafl.domain.Offender;
import com.danishcaptain.games.hnefatafl.widget.CenterCastle;
import com.danishcaptain.games.hnefatafl.widget.DefenseLocation;
import com.danishcaptain.games.hnefatafl.widget.OffenseLocation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createKing(R.id.buttonCC);

        createDefender(R.id.button6_4);
        createDefender(R.id.button5_5);
        createDefender(R.id.button6_5);
        createDefender(R.id.button7_5);
        createDefender(R.id.button4_6);
        createDefender(R.id.button5_6);
        createDefender(R.id.button7_6);
        createDefender(R.id.button8_6);
        createDefender(R.id.button5_7);
        createDefender(R.id.button6_7);
        createDefender(R.id.button7_7);
        createDefender(R.id.button6_8);

        createOffender(R.id.buttonOT1);
        createOffender(R.id.buttonOT2);
        createOffender(R.id.buttonOT3);
        createOffender(R.id.buttonOT4);
        createOffender(R.id.buttonOT5);
        createOffender(R.id.buttonOT6);
        createOffender(R.id.buttonOT7);
        createOffender(R.id.buttonOT8);

        createOffender(R.id.buttonOL1);
        createOffender(R.id.buttonOL2);
        createOffender(R.id.buttonOL3);
        createOffender(R.id.buttonOL4);
        createOffender(R.id.buttonOL5);
        createOffender(R.id.buttonOL6);
        createOffender(R.id.buttonOL7);
        createOffender(R.id.buttonOL8);

        createOffender(R.id.buttonOR1);
        createOffender(R.id.buttonOR2);
        createOffender(R.id.buttonOR3);
        createOffender(R.id.buttonOR4);
        createOffender(R.id.buttonOR5);
        createOffender(R.id.buttonOR6);
        createOffender(R.id.buttonOR7);
        createOffender(R.id.buttonOR8);

        createOffender(R.id.buttonOB1);
        createOffender(R.id.buttonOB2);
        createOffender(R.id.buttonOB3);
        createOffender(R.id.buttonOB4);
        createOffender(R.id.buttonOB5);
        createOffender(R.id.buttonOB6);
        createOffender(R.id.buttonOB7);
        createOffender(R.id.buttonOB8);
    }

    private void createKing(int id) {
        CenterCastle c1 = findViewById(id);
        c1.add(new King());
    }

    private void createDefender(int id) {
        DefenseLocation c1 = findViewById(id);
        c1.add(new Defender());
    }

    private void createOffender(int id) {
        OffenseLocation c1 = findViewById(id);
        c1.add(new Offender());
    }
}
