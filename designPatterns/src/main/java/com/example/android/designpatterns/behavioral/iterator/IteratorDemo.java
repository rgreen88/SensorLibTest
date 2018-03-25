package com.example.android.designpatterns.behavioral.iterator;

import java.util.Iterator;

/**
 * Created by rynel on 3/25/2018.
 */

public class IteratorDemo {

    public static void main(String[] args) {

        Game game1 = new Game("Resident Evil 7 Gold", 59.99f);
        Game game2 = new Game("Far Cry 5", 56.80f);
        Game game3 = new Game("Streets of Rage 3", 120.00f);

        GameList gameList = new GameList();
        gameList.addItem(game1);
        gameList.addItem(game2);
        gameList.addItem(game3);


        System.out.println("Displaying Menu:");
        Iterator<Game> iterator;
        iterator = gameList.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            System.out.println(game);
        }

        System.out.println("\nRemoving last item returned");
        iterator.remove();

        System.out.println("\nDisplaying Menu:");
        iterator = gameList.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            System.out.println(game);
        }

    }

}
