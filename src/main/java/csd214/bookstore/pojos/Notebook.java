package csd214.bookstore.pojos;


public class Notebook extends Stationery {
    private int pageCount;

    @Override
    public void initialize() {
        super.initialize();

        System.out.println("How many pages it has? ");
        this.pageCount = getInput(pageCount);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling" + getBrand() + "Notebook with" + pageCount + "pages...");
    }

    @Override
    public double getPrice() {
        return 50;
    }
}


