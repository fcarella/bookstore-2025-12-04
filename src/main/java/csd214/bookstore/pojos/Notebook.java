package csd214.bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Notebook implements SaleableItem {

    private String name;
    private int pages;
    private double price;
    private int copies;

    public Notebook(String name, int pages, double price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }

    public Notebook() { }

    public void initialize(Scanner input) {
        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Pages: ");
        pages = Integer.parseInt(input.nextLine());

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

    public int getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook)) return false;
        Notebook that = (Notebook) o;
        return pages == that.pages &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, price);
    }
}
