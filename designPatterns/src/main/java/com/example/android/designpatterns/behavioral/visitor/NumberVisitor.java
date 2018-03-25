package com.example.android.designpatterns.behavioral.visitor;

import java.util.List;

/**
 * Created by rynel on 3/25/2018.
 */

public interface NumberVisitor {


    void visit(TwoElement twoElement);

    void visit(ThreeElement threeElement);

    void visit(List<NumberElement> elementList);

}
