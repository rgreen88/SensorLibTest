package com.example.android.designpatterns.behavioral.template;

/**
 * Rsponsible for handling actions from the View and updating the UI as required
 */

public class MainPresenter implements MainContract.Presenter{

    private MainContract.MvpView mView;

    //constructor
    MainContract.MvpView view;
    {
        mView = view;
    }

    public MainPresenter() {

    }
}
