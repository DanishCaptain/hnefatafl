package com.danishcaptain.games.hnefatafl.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class BannerAdView extends AppCompatTextView {
    private Rect rectangle;
    private Paint paintB;
    private Paint paintT;
    //    private String text;
    private int minWidth;
    private int minHeight;

    public BannerAdView(Context context) {
        super(context);
        init(10, 10);
    }

    public void init(int width, int height) {
        this.minWidth = width;
        this.minHeight = height;
        int x = 50;
        int y = 50;
        int sideLength = 200;

        // create the Paint and set its color
        paintB = new Paint();
        paintB.setColor(Color.BLACK);
        paintB.setStrokeWidth(6);
        paintT = new Paint();
        paintT.setColor(Color.BLACK);
        paintT.setTextSize(60);

    }

    public BannerAdView(Context context, AttributeSet attributes) {
        super(context, attributes);
        init(50, 50);
    }

    public BannerAdView(Context context, AttributeSet attributes, int styleAttributes) {
        super(context, attributes, styleAttributes);
        init(50, 50);
    }

    /*
    public BannerAdView(Context context, AttributeSet attributes, int styleAttribute, int styleResource) {
        super(context, attributes, styleAttribute, styleResource);
        init();
    }
    */

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            rectangle = new Rect(left, top, right, bottom);
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        //int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int width = Math.max(MeasureSpec.getSize(widthMeasureSpec), minWidth);
        int height = Math.max(MeasureSpec.getSize(heightMeasureSpec), minHeight);
        setMeasuredDimension(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        canvas.drawLine(rectangle.left, rectangle.top, rectangle.right-2, rectangle.top, paintB);
        canvas.drawLine(rectangle.left, rectangle.bottom-2, rectangle.right-2, rectangle.bottom-2, paintB);
        canvas.drawLine(rectangle.left, rectangle.top, rectangle.left, rectangle.bottom-2, paintB);
        canvas.drawLine(rectangle.right-2, rectangle.top, rectangle.right-2, rectangle.bottom-2, paintB);
//        canvas.drawColor(Color.RED);
        String text = getText().toString();
        canvas.drawText(text, rectangle.left+50, rectangle.top+50, paintT);
    }

}
