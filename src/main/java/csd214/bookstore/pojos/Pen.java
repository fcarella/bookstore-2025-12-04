package csd214.bookstore.pojos;

public class Pen extends Stationery {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void initialize() {
        super.initialize(); // Calls Stationery.initialize() for brand
        System.out.println("Enter Color:");
        this.color = getInput("Blue");
    }

    @Override
    public void edit() {
        super.edit(); // Edits brand
        System.out.println("Edit Color:");
        this.color = getInput(this.color);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + color + " Pen...");
    }

    @Override
    public String toString() {
        return "Pen[color=" + color + ", brand=" + getBrand() + "]";
    }
}