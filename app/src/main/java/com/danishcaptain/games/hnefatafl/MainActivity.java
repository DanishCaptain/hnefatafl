package com.danishcaptain.games.hnefatafl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.danishcaptain.games.hnefatafl.model.GameModel;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;

public class MainActivity extends AppCompatActivity {
    private PublisherAdView adView1;
    private PublisherAdView adView2;

//    private BannerAdView adTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GameModel.getInstance().init(this);

        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(GameModel.getInstance());

        TextView player1TextView = findViewById(R.id.player1Text);
        GameModel.getInstance().getPlayerInstance().initOffensePlayer(player1TextView);

        TextView player2TextView = findViewById(R.id.player2Text);
        GameModel.getInstance().getPlayerInstance().initDefensePlayer(player2TextView);

        TextView infoTextView = findViewById(R.id.infoText);
        GameModel.getInstance().getPlayerInstance().initInfo(infoTextView);

        adView2 = findViewById(R.id.publisherAdView);
        PublisherAdRequest adRequest2 = new PublisherAdRequest.Builder().build();
        adView2.loadAd(adRequest2);

        LinearLayout base = findViewById(R.id.base);
        adView1 = new PublisherAdView(this);
        adView1.setAdSizes(AdSize.BANNER, new AdSize(300, 250));
        adView1.setAdUnitId("/6499/example/banner");
        PublisherAdRequest adRequest1 = new PublisherAdRequest.Builder().build();
        adView1.loadAd(adRequest1);

        ViewGroup.LayoutParams p = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        base.addView(adView1, p);


    }

}
