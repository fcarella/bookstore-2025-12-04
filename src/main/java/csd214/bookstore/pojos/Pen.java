package csd214.bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Pen extends Stationary {

    private String color;
    private int price;


    public Pen(String brand, String color, double price, int copies) {
        this.color = color;

    }

    public Pen() {}
    @Override
    public void initialize(Scanner input) {
        super.initialize(input);   // Brand is handled HERE
        System.out.println("Enter Pen Color: ");
        color = input.nextLine();

        System.out.println("Enter Pen Brand: ");
        setBrand(input.nextLine());

    }


    @Override
    public void sellItem() {
        decrementCopies();
        System.out.println("Selling " + color + " Pen...");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        return Double.compare(pen.price, price) == 0
                && Objects.equals(getBrand(), pen.getBrand())
                && Objects.equals(color, pen.color);
    }



    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}


