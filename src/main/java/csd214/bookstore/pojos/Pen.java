package csd214.bookstore.pojos;

public abstract class Pen extends Stationery {

    private String color;

    @Override
    public void initialize() {
        super.initialize(); // Product + Stationery logic
        System.out.println("Enter Color:");
        this.color = getInput("Blue");
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + color + " Pen...");
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + getPrice() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", color='" + color + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
