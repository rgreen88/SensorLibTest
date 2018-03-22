package com.example.android.sensorhelper;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/**
 * Created by rynel on 3/22/2018.
 */

public class SensorHelper extends Activity implements SensorEventListener {
    private final SensorManager mSensorManager;
    private final Sensor mAccelerometer;

    double x, y, sensorX, sensorY;

    public SensorHelper() {
        mSensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //if statement designating action as long as movement occurs
        if (mSensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER).size() != 0) {
            //do action here
            Sensor s = mSensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER).get(0);
        }
        //instantiating all double values to 0
        x = y = sensorX = sensorY = 0;
    }

    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //test accuracy of changed event
    }

    public void onSensorChanged(SensorEvent event) {
        //Thread sleep to prevent processing each time a slight move occurs
        try {
            Thread.sleep(16);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //called when accelerometer senses directional change
        sensorX = event.values[0];
        sensorY = event.values[1];
    }
}