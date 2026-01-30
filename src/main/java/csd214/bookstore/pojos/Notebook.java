package csd214.bookstore.pojos;
import java.util.Objects;
import java.util.Scanner;


public class Notebook extends Stationery {
    private int pageCount;

    public Notebook(String brand, int pageCount) {
        setPageCount(pageCount);
    }

    public Notebook() {

    }


    @Override
    public void edit(Scanner input) {
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Notebook notebook = (Notebook) o;
        return pageCount == notebook.pageCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pageCount);
    }

    @Override
    public void initialize(Scanner input) {
        System.out.println("How many pages it has? ");
        this.pageCount = getInput(input, pageCount);
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


