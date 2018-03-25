package com.example.android.designpatterns.behavioral.momento;

/**
 * Created by rynel on 3/25/2018.
 */

public class GameInfoCaretaker {

    Object objMemento;

    public void saveState(GameInfo gameInfo) {
        objMemento = gameInfo.save();
    }

    public void restoreState(GameInfo gameInfo) {
        gameInfo.restore(objMemento);
    }
}
