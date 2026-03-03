package csd214.bookstore.pojos;

import java.util.Objects;

public class Notebook extends Stationery {

    private int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Page Count:");
        String input = getInput("100");
        try {
            this.pageCount = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            this.pageCount = 100;
        }
    }

    // --- PART D: Business Logic (Stock Reduction) ---
    @Override
    public void sellItem() {
        System.out.println("Selling " + getBrand() + " Notebook with " + pageCount + " pages...");
        this.setCopies(this.getCopies() - 1);
    }

    // --- PART B: Identity (Equality) ---
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return pageCount == notebook.pageCount &&
                Double.compare(notebook.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), notebook.getName()) &&
                Objects.equals(getBrand(), notebook.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getBrand(), pageCount);
    }

    @Override
    public String toString() {
        return "Notebook: " + getName() + " (" + getBrand() + ", Pages: " + pageCount + ", Price: $" + getPrice() + ")";
    }
}