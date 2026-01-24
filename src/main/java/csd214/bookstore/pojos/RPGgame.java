package csd214.bookstore.pojos;

import java.util.Scanner;

public class RPGgame extends VideoGame{
    private int mainStoryHours;

    @Override
    public void initialize() {
        super.initialize();
       Scanner mainStory = new Scanner(System.in);
        System.out.println("How many hours is the main Story?: ");
        mainStoryHours = mainStory.nextInt();
    }

    @Override
    public void sellItem() {
        System.out.println("Selling RPG Game for " + Platform + " | Story Length: " + mainStoryHours + " hours");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
