package com.orbitsys.facadepatterndemo;

import android.util.Log;

public class Square implements Shape {
    public static final String TAG="Square";
    @Override
    public void draw() {
        Log.d(TAG, "draw: Square ");
    }
}
