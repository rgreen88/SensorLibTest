package com.example.android.designpatterns.behavioral.visitor;

/**
 * Created by rynel on 3/25/2018.
 */

public interface NumberElement {

    void accept(NumberVisitor visitor);

}
