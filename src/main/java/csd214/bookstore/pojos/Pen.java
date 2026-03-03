package csd214.bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Pen extends Stationery {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void initialize() {

        super.initialize();

        System.out.println("Enter Color:");

        this.color = getInput("");
    }

    @Override
    public void sellItem() {

        System.out.println("Selling " + this.color + " Pen...");
    }

    @Override
    public String toString() {
        return "Pen: " + this.getName() + " (" + this.getBrand() +
                ", Color: " + this.color + ", Price: $" + this.getPrice() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), pen.getName()) &&
                Objects.equals(getBrand(), pen.getBrand()) &&
                Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getBrand(), color);
    }
}
