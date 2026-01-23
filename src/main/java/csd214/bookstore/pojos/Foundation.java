package csd214.bookstore.pojos;

public class Foundation extends MakeupProduct{
    private String coverage;

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Select coverage");
        this.coverage = getInput("Full coverage");
    }
    @Override
    public void edit() {
        super.edit();
        System.out.print("Edit coverage [" +  this.coverage + "]:");
        this.coverage = getInput(this.coverage);
    }
    @Override
    public void sellItem() {
        System.out.println("Selling Foundation: " + getShade() + " with " + coverage + " for " + getPrice());
    }

    @Override
    public double getPrice() {
        return 40;
    }

}
