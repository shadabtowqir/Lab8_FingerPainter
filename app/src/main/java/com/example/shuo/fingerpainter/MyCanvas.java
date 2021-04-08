package com.example.shuo.fingerpainter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import java.util.HashMap;


public class MyCanvas extends View {


    public MyCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
    }

    public void addPath(int id, float x, float y) {

    }

    public void updatePath(int id, float x, float y) {

    }

    public void removePath(int id) {

    }
}
