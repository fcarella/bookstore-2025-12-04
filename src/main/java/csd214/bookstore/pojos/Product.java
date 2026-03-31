package csd214.bookstore.pojos;

import java.io.Serializable;
import java.util.Scanner;

// Marked abstract because it implements SaleableItem but doesn't implement getPrice()
// (Price is defined in children: Ticket and Publication)
public abstract class Product extends Editable implements SaleableItem {
    private double price;
    private int copies;

    public double getPrice() {
        return price;
    }

    public int getCopies() {
        return copies;
    }

    @Override
    public void initialize(Scanner input) {
        System.out.println("Enter Price:");
        price = Double.parseDouble(input.nextLine());

        System.out.println("Enter Copies:");
        copies = Integer.parseInt(input.nextLine());
    }

    protected void decrementCopies() {
        if (copies > 0) copies--;
    }
}
