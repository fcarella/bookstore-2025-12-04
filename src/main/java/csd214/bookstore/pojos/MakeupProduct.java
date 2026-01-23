package csd214.bookstore.pojos;

public abstract class MakeupProduct extends Product {
    public String getShade() {
        return shade;
    }
    private String shade;

    @Override
    public void edit() {
        System.out.println("Edit shade [" + this.shade + "]: ");
        this.shade = getInput(this.shade);
    }

    @Override
    public void initialize() {
        System.out.println("Select a shade");
       this.shade = getInput("100");
    }
}
