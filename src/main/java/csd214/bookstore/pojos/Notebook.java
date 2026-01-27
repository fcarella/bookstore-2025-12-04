package csd214.bookstore.pojos;

import java.util.Scanner;

public class Notebook extends Stationary {
    private int pageCount;

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);

        Scanner page = new Scanner(System.in);
        System.out.println("What is the Page Count: ");
        pageCount = page.nextInt();
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + getBrand() + " Notebook with " + pageCount + " pages...");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}