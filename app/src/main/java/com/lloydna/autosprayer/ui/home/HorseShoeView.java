package com.lloydna.autosprayer.ui.home;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class HorseShoeView extends View {
    private Paint mPaint;
    private Path mPath;

    private int mHumidityLevel = 60;

    public HorseShoeView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.FILL);
        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float angle = 180f * mHumidityLevel / 100f;

        // draw the unlit part of the horseshoe
        mPaint.setColor(Color.GRAY);
        mPath.reset();
        mPath.moveTo(getWidth() / 2, getHeight() / 2);
        mPath.arcTo(new RectF(0, 0, getWidth(), getHeight()), 0f, -180f, true);
        mPath.lineTo(getWidth() / 2, getHeight() / 2);
        canvas.drawPath(mPath, mPaint);

        // draw the filled part of the horseshoe
        mPaint.setColor(Color.BLUE);
        mPath.reset();
        mPath.moveTo(getWidth() / 2, getHeight() / 2);
        mPath.arcTo(new RectF(0, 0, getWidth(), getHeight()), 0f, -angle, true);
        mPath.lineTo(getWidth() / 2, getHeight() / 2);
        canvas.drawPath(mPath, mPaint);

    }

    public void setHumidityLevel(int humidityLevel) {
        mHumidityLevel = humidityLevel;
        invalidate(); // redraw the view
    }
}

