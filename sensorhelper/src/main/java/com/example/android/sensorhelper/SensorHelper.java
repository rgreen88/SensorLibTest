package com.example.android.sensorhelper;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/**
 * Created by rynel on 3/22/2018.
 */

public class SensorHelper implements SensorEventListener {
    private final SensorManager mSensorManager;
    private final Sensor mAccelerometer;
    private Context context;

    double x, y, sensorX, sensorY;

    public SensorHelper(SensorManager mSensorManager, Sensor mAccelerometer, Context context) {
        this.mSensorManager = mSensorManager;
        this.mAccelerometer = mAccelerometer;
        this.context = context;
    }

    //TODO: utilize SensorCallback
    interface SensorCallback {
        Object getSensor(SensorEvent event);

        void setSensor(SensorEvent event);
    }

    public SensorHelper() {
        mSensorManager = (SensorManager)context.getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //if statement designating action as long as movement occurs
        if (mSensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER).size() != 0) {
            //do action here;
        }
        //instantiating all double values to 0
        x = y = sensorX = sensorY = 0;
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
