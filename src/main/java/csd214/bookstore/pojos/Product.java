package csd214.bookstore.pojos;

import java.io.Serializable;

public abstract class Product extends Editable implements SaleableItem, Serializable {

    private String productId;
    private String name;
    private double price;

    // --- NEW FIELD FOR PART D ---
    private int copies = 10;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // --- NEW GETTER AND SETTER FOR PART D ---
    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}