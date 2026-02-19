package csd214.bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Pen implements SaleableItem {

    private String name;
    private String color;
    private double price;
    private int copies;

    public Pen(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Pen() { }

    public void initialize(Scanner input) {
        System.out.print("Brand: ");
        name = input.nextLine();

        System.out.print("Color: ");
        color = input.nextLine();

        System.out.print("Copies: ");
        copies = Integer.parseInt(input.nextLine());

        System.out.print("Price: ");
        price = Double.parseDouble(input.nextLine());
    }

    @Override
    public void sellItem() {
        if (copies > 0) {
            copies--;
        }
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getCopies() {
        return copies;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.price, price) == 0 &&
                Objects.equals(name, pen.name) &&
                Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price);
    }
}
