package com.example.android.designpatterns.behavioral.template;

/**
 * Rsponsible for handling actions from the View and updating the UI as required
 */

public class MainPresenter implements MainContract.Presenter{

    //constructor
    MainContract.MvpView view;
    {
        MainContract.MvpView mView = view;
    }

    public MainPresenter() {

    }
}
