package csd214.bookstore.pojos;

import java.util.Scanner;

public class Pen extends Stationary{
    private String Color;

    @Override
    public void initialize(){
        super.initialize();

        Scanner color = new Scanner(System.in);
        System.out.println("Enter pen color: ");
        Color = color.nextLine();
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + Color + " Pen...");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
