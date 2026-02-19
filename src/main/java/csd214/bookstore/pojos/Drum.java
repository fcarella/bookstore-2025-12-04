package csd214.bookstore.pojos;

import java.util.Scanner;

public class Drum extends MusicalInstruments {

    private String drumType;

    public Drum() {
        super();
    }

    @Override
    public void initialize(Scanner scanner) {
        super.initialize(scanner);
        System.out.println("Enter Drum Type:");
        this.drumType = getInput("Snare");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Edit Drum Type:");
        this.drumType = getInput(this.drumType);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + drumType + " Drum...");
    }
}