package com.orbitsys.facadepatterndemo;

import android.util.Log;

public class Circle implements Shape {
    public static final String TAG="Circle";
    @Override
    public void draw() {
        Log.d(TAG, "draw: Circle");

    }
}
