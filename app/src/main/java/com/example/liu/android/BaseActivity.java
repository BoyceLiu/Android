package com.example.liu.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Liu on 2015/4/29.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity", getClass().getSimpleName());
    }
}
