package com.example.android.designpatterns.behavioral.template;

/**
 * Displays main screen when app loads
 */
public class MainActivity implements MainContract.MvpView{


    public static void main(String[] args) {

        MainPresenter mainPresenter = new MainPresenter(); //<-- referring to MvpView


    }
}
