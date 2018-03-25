package com.example.android.designpatterns.behavioral.observer;

/**
 * Created by rynel on 3/25/2018.
 */

public class ObserverDemo {

    public static void main(String[] args) {

        PatientStation patientStation = new PatientStation(98.6);

        PatientA patientA = new PatientA();
        PatientB patientB = new PatientB();
        patientStation.addObserver(patientA);
        patientStation.addObserver(patientB);

        patientStation.setTemperature(98.5);

        patientStation.removeObserver(patientB);

        patientStation.setTemperature(102.7);
    }
}
