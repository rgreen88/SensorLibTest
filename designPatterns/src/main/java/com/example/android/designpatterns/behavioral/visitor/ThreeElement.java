package com.example.android.designpatterns.behavioral.visitor;

/**
 * Created by rynel on 3/25/2018.
 */

public class ThreeElement implements NumberElement {

    int a;
    int b;
    int c;

    public ThreeElement(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override  //visitor pass from interface
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}
