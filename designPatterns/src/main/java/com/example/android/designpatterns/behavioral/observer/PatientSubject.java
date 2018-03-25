package com.example.android.designpatterns.behavioral.observer;

/**
 * Created by rynel on 3/25/2018.
 */

public interface PatientSubject {

    void addObserver(PatientObserver patientObserver);

    void removeObserver(PatientObserver patientObserver);

    void doNotify();

}
