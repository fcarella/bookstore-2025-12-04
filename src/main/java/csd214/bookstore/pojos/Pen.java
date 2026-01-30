package csd214.bookstore.pojos;
import java.util.Objects;
import java.util.Scanner;

public class Pen extends Stationery{
    private String color;
    private double v;

    public Pen() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pen(String brand,String color, double v) {
        super(brand);
        this.color = color;
        this.v = v;
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
        super.initialize(input);
        System.out.println("Enter Color");
        setColor(getInput(input, "Color"));
        System.out.println("Enter pen value:");
        setV(getInput(input, 0.0));
    }
    @Override
    public void sellItem() {
        System.out.println("Selling" + color + "Pen");
    }

    @Override
    public double getPrice() {
        return 5;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
