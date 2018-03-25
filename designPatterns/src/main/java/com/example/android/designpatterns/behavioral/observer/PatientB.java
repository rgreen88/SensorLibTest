package com.example.android.designpatterns.behavioral.observer;

/**
 * Created by rynel on 3/25/2018.
 */

public class PatientB implements PatientObserver {
    @Override
    public void doUpdate(double temperature) {
        System.out.println("Patient B just found out their temperature is: " + temperature);
    }
}
