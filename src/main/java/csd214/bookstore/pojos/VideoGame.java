package csd214.bookstore.pojos;

import java.util.Scanner;

public abstract class VideoGame extends Product{
    protected String Platform;

    @Override
    public void initialize(Scanner input){
        super.initialize(input);
    }

    @Override
    public void edit(Scanner input){
        System.out.println("Edit " + this.Platform + ": ");
        this.Platform = getInput(input, this.Platform);
    }
}
