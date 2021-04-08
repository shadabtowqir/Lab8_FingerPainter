package com.example.shuo.fingerpainter;

import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


public class TouchListener implements View.OnTouchListener {
    MainActivity mainActivity;


    public TouchListener(MainActivity ma) {
        this.mainActivity = ma;

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        return true;
    }



    private class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onDoubleTap(MotionEvent e) {

            return super.onDoubleTap(e);
        }

        @Override
        public void onLongPress(MotionEvent e) {

            super.onLongPress(e);
        }
    }
}
