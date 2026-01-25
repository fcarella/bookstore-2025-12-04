package csd214.bookstore.pojos;

public abstract class Stationery extends Product {

    private String brand;

    // Getter
    public String getBrand() {
        return brand;
    }

    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void initialize() {
        super.initialize(); // Product asks for name, price, copies
        System.out.println("Enter Brand:");
        this.brand = getInput("Generic");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Enter new Brand:");
        this.brand = getInput(this.brand);
    }
}
