package com.example.liu.android;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Liu on 2015/4/29.
 */
public class FirstActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);
        SharedPreferences sharedPreferences = getSharedPreferences("acount", 0);
        String uname = sharedPreferences.getString("uname", "");
        String passwd = sharedPreferences.getString("passwd", "");
        if ("".equals(uname) || "".equals(passwd)) {
            Log.d("FirstActivity", "need to login");
        } else {
            Log.d("FirstActivity", "auto login");
        }
    }
}
