package csd214.bookstore.pojos;

import java.util.Scanner;

public abstract class MusicalInstruments extends Product {

    private String material;

    @Override
    public void initialize(Scanner scanner) {
        super.initialize(scanner);
        System.out.println("Enter Material:");
        this.material = getInput("Wood");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Edit Material:");
        this.material = getInput(this.material);
    }

    @Override
    public double getPrice() {
        return getPrice();
    }
}