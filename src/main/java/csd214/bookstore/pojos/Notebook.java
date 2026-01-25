package csd214.bookstore.pojos;

public class Notebook extends Stationery {

    private int pageCount;
    private double price;
    private String description;

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Page Count:");
        this.pageCount = Integer.parseInt(getInput("100"));
    }

    @Override
    public void sellItem() {
        System.out.println(
                "Selling " + getBrand() +
                        " Notebook with " + pageCount + " pages..."
        );
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "description='" + description + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", pages=" + pageCount +
                ", price=" + price +
                '}';
    }
}
