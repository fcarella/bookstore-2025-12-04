package csd214.bookstore.pojos;

public class Lipstick extends MakeupProduct {
    private String finish;

    @Override
    public void sellItem() {
        System.out.println("Selling Lipstick: " + getShade() + "with a " + finish + " finish for " + getPrice());
    }

    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println(" Select the finish for your Lipstick");
        this.finish = getInput("Gloss");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Edit your finish Lipstick [" + this.finish + "]:");
        this.finish = getInput(this.finish);

    }
}
