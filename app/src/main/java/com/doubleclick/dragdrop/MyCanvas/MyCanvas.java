package com.doubleclick.dragdrop.MyCanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyCanvas extends View {

    Paint paint;
    public boolean check = false;
    public boolean left = false;
    public boolean right = false;
    public boolean up = false;
    public boolean down = false;
    float x, y;

    public MyCanvas(Context context) {
        super(context);
        init();
    }

    public MyCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GREEN);
        if (check == false) {
            canvas.drawCircle(this.getWidth() / 2f, this.getHeight() / 2f, 100, paint);
            this.x = this.getWidth() / 2f;
            this.y = this.getHeight() / 2f;
        } else if (left) {
            x = x - 20;
            canvas.drawCircle(x, y, 100, paint);
        } else if (right) {
            x = x + 20;
            canvas.drawCircle(x, y, 100, paint);
        } else if (up) {
            y = y - 20;
            canvas.drawCircle(x, y, 100, paint);
        } else if (down) {
            y = y + 20;
            canvas.drawCircle(x, y, 100, paint);
        }

    }
}
