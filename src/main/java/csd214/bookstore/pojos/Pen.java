package csd214.bookstore.pojos;
import java.util.Objects;
import java.util.Scanner;

public class Pen extends Stationery{
    private String color;

    public Pen(String pilot, String blue, double v) {
    }

    public Pen() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pen pen = (Pen) o;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public void edit(Scanner input) {
    }

    @Override
    public void initialize(Scanner input){
        System.out.println("Enter Color");
        this.color = getInput(input,"Unknown color");
    }
    @Override
    public void sellItem() {
        System.out.println("Selling" + color + "Pen");
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
