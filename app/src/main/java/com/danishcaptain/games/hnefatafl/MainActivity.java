package com.danishcaptain.games.hnefatafl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.danishcaptain.games.hnefatafl.domain.Defender;
import com.danishcaptain.games.hnefatafl.domain.King;
import com.danishcaptain.games.hnefatafl.domain.Offender;
import com.danishcaptain.games.hnefatafl.domain.Piece;
import com.danishcaptain.games.hnefatafl.widget.CenterCastle;
import com.danishcaptain.games.hnefatafl.widget.CornerCastle;
import com.danishcaptain.games.hnefatafl.widget.DefenseLocation;
import com.danishcaptain.games.hnefatafl.widget.EmptyLocation;
import com.danishcaptain.games.hnefatafl.widget.MoveLocation;
import com.danishcaptain.games.hnefatafl.widget.OffenseLocation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createKing(R.id.buttonCC);
        initCorner(R.id.buttonTL);
        initCorner(R.id.buttonTR);
        initCorner(R.id.buttonBL);
        initCorner(R.id.buttonBR);

        createDefender(R.id.buttonD1);
        createDefender(R.id.buttonD2);
        createDefender(R.id.buttonD3);
        createDefender(R.id.buttonD4);
        createDefender(R.id.buttonD5);
        createDefender(R.id.buttonD6);
        createDefender(R.id.buttonD7);
        createDefender(R.id.buttonD8);
        createDefender(R.id.buttonD9);
        createDefender(R.id.buttonD10);
        createDefender(R.id.buttonD11);
        createDefender(R.id.buttonD12);

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

        initEmpty(R.id.buttonE1);
        initEmpty(R.id.buttonE2);
        initEmpty(R.id.buttonE3);
        initEmpty(R.id.buttonE4);
        initEmpty(R.id.buttonE5);
        initEmpty(R.id.buttonE6);
        initEmpty(R.id.buttonE7);
        initEmpty(R.id.buttonE8);
        initEmpty(R.id.buttonE9);
        initEmpty(R.id.buttonE10);
        initEmpty(R.id.buttonE11);
        initEmpty(R.id.buttonE12);
        initEmpty(R.id.buttonE13);
        initEmpty(R.id.buttonE14);
        initEmpty(R.id.buttonE15);
        initEmpty(R.id.buttonE16);
        initEmpty(R.id.buttonE17);
        initEmpty(R.id.buttonE18);
        initEmpty(R.id.buttonE19);
        initEmpty(R.id.buttonE20);
        initEmpty(R.id.buttonE21);
        initEmpty(R.id.buttonE22);
        initEmpty(R.id.buttonE23);
        initEmpty(R.id.buttonE24);
        initEmpty(R.id.buttonE25);
        initEmpty(R.id.buttonE26);
        initEmpty(R.id.buttonE27);
        initEmpty(R.id.buttonE28);
        initEmpty(R.id.buttonE29);
        initEmpty(R.id.buttonE30);
        initEmpty(R.id.buttonE31);
        initEmpty(R.id.buttonE32);
        initEmpty(R.id.buttonE33);
        initEmpty(R.id.buttonE34);
        initEmpty(R.id.buttonE35);
        initEmpty(R.id.buttonE36);
        initEmpty(R.id.buttonE37);
        initEmpty(R.id.buttonE38);
        initEmpty(R.id.buttonE39);
        initEmpty(R.id.buttonE40);
        initEmpty(R.id.buttonE41);
        initEmpty(R.id.buttonE42);
        initEmpty(R.id.buttonE43);
        initEmpty(R.id.buttonE44);
        initEmpty(R.id.buttonE45);
        initEmpty(R.id.buttonE46);
        initEmpty(R.id.buttonE47);
        initEmpty(R.id.buttonE48);
        initEmpty(R.id.buttonE49);
        initEmpty(R.id.buttonE50);
        initEmpty(R.id.buttonE51);
        initEmpty(R.id.buttonE52);
        initEmpty(R.id.buttonE53);
        initEmpty(R.id.buttonE54);
        initEmpty(R.id.buttonE55);
        initEmpty(R.id.buttonE56);
        initEmpty(R.id.buttonE57);
        initEmpty(R.id.buttonE58);
        initEmpty(R.id.buttonE59);
        initEmpty(R.id.buttonE60);
        initEmpty(R.id.buttonE61);
        initEmpty(R.id.buttonE62);
        initEmpty(R.id.buttonE63);
        initEmpty(R.id.buttonE64);
        initEmpty(R.id.buttonE65);
        initEmpty(R.id.buttonE66);
        initEmpty(R.id.buttonE67);
        initEmpty(R.id.buttonE68);
        initEmpty(R.id.buttonE69);
        initEmpty(R.id.buttonE70);
    }

    private void createKing(int id) {
        CenterCastle c1 = findViewById(id);
        c1.setOnClickListener(this);
        King k = new King();
        c1.add(k);
    }

    private void initCorner(int id) {
       CornerCastle c1 = findViewById(id);
        c1.setOnClickListener(this);
    }

    private void createDefender(int id) {
        DefenseLocation c1 = findViewById(id);
        c1.setOnClickListener(this);
        Defender d = new Defender();
        c1.add(d);
    }

    private void createOffender(int id) {
        OffenseLocation c1 = findViewById(id);
        c1.setOnClickListener(this);
        Offender o = new Offender();
        c1.add(o);
    }

    private void initEmpty(int id) {
        EmptyLocation c1 = findViewById(id);
        c1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MoveLocation ml = (MoveLocation) v;
        if (ml.hasPiece()) {
            Piece p = ml.getPiece();
            System.out.println("bks: "+p.getDisplayText());
        } else {
            System.out.println("bks: "+v.getId());
        }
    }
}
