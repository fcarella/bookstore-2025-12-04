package csd214.bookstore.pojos;

public abstract class Stationery extends Product {
    private String brand;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    @Override
    public void initialize() {
        // super.initialize();
        System.out.println("Enter Brand:");
        this.brand = getInput("Generic");
    }

    @Override
    public void edit() {
        // super.edit();
        System.out.println("Edit Brand:");
        this.brand = getInput(this.brand);
    }

    @Override
    public double getPrice() {
        return 0.0; // We must add price field
    }

    @Override
    public String toString() {
        return "Stationery[brand=" + brand + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Stationery)) return false;
        Stationery that = (Stationery) obj;
        return brand.equals(that.brand);
    }

    @Override
    public int hashCode() {
        return brand != null ? brand.hashCode() : 0;
    }
}