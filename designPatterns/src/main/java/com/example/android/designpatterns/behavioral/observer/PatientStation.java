package com.example.android.designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rynel on 3/25/2018.
 */

public class PatientStation implements PatientSubject {


    private Set<PatientObserver> patientObservers;
    private double temperature;

    public PatientStation(double temperature) {
        patientObservers = new HashSet<>();
        this.temperature = temperature;
    }

    @Override
    public void addObserver(PatientObserver patientObserver) {
        patientObservers.add(patientObserver);
    }


    @Override
    public void removeObserver(PatientObserver patientObserver) {
        patientObservers.remove(patientObserver);
    }

    @Override
    public void doNotify() {
        for (PatientObserver patientObserver : patientObservers) {
            patientObserver.doUpdate(temperature);
        }
    }

    public void setTemperature(double newTemperature) {
        System.out.println("\nPatient's temperature is at " + newTemperature);
        temperature = newTemperature;
        doNotify();
    }
}
