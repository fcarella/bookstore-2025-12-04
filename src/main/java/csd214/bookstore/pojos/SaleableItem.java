package csd214.bookstore.pojos;

public interface SaleableItem {
    void sellItem();

    default double getPrice() {
        return 0;
    }
}
