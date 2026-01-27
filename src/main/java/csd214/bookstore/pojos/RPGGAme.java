package csd214.bookstore.pojos;

import java.util.Scanner;

public class RPGGAme extends VideoGame {
    private int mainStoryHours;

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);
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
