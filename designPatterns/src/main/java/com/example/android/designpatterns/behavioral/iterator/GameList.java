package com.example.android.designpatterns.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by rynel on 3/25/2018.
 */

public class GameList {

    List<Game> gameList;

    public GameList() {
        this.gameList = gameList;
    }

    public void addItem(Game game) {
        gameList.add(game);
    }

    public Iterator<Game> iterator() {
        return new MenuIterator();
    }

    class MenuIterator implements Iterator<Game> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= gameList.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Game next() {
            return gameList.get(currentIndex++);
        }

        @Override
        public void remove() {
            gameList.remove(--currentIndex);
        }

    }
}
