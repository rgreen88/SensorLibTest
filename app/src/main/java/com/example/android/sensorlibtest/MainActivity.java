package com.example.android.sensorlibtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.sensorhelper.SensorHelper;

public class MainActivity extends AppCompatActivity {

    SensorHelper mSensorHelper;
    TextView textView;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}