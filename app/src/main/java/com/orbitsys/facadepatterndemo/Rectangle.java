package com.orbitsys.facadepatterndemo;

import android.util.Log;

public class Rectangle implements Shape {
    public static final String TAG="Rectangle";
    @Override
    public void draw() {
        Log.d(TAG, "draw: Rectangle");
    }
}
