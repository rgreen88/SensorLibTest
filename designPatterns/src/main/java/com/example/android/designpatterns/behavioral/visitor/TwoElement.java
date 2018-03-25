package com.example.android.designpatterns.behavioral.visitor;

/**
 * Created by rynel on 3/25/2018.
 */

public class TwoElement implements NumberElement{

    int a;
    int b;

    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override //visitor pass from interface
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }

}
