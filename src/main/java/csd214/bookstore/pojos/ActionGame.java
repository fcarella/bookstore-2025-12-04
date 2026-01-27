package csd214.bookstore.pojos;

import java.util.Scanner;

public class ActionGame extends VideoGame {
    private boolean isMultiplayer;

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);
        isMultiplayer = true;
    }

    @Override
    public void sellItem() {
        System.out.println("Selling Action Game for " + Platform + " | Multiplayer: " + isMultiplayer);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
