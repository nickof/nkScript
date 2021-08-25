package com.nk.nkscript;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.stardust.app.GlobalAppContext;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GlobalAppContext.set(getApplication());
    }
}