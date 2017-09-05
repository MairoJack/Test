package com.pcjr.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Print();//new
        setContentView(R.layout.activity_main);
    }
    private void Print() {
        Log.d("myTag", "This is my message");
    }
}
