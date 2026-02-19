package csd214.bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Guitar implements SaleableItem {

    private String brand;
    private double price;
    private int numStrings;
    private int copies;

    public Guitar() { }


    public Guitar(String brand, double price, int numStrings, int copies) {
        this.brand = brand;
        this.price = price;
        this.numStrings = numStrings;
        this.copies = copies;
    }
    public void initialize(Scanner input) {
        System.out.print("Enter brand: ");
        this.brand = input.nextLine();

        System.out.print("Enter number of strings: ");
        this.numStrings = Integer.parseInt(input.nextLine());

        System.out.print("Enter copies: ");
        this.copies = Integer.parseInt(input.nextLine());

        System.out.print("Enter price: ");
        this.price = Double.parseDouble(input.nextLine());
    }

    @Override
    public void sellItem() {
        if (copies > 0) {
            copies--;
        }
    }

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public int getNumStrings() {
        return numStrings;
    }

    public int getCopies() {
        return copies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;
        Guitar guitar = (Guitar) o;
        return Double.compare(guitar.price, price) == 0 &&
                numStrings == guitar.numStrings &&
                copies == guitar.copies &&
                Objects.equals(brand, guitar.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, numStrings, copies);
    }
}
