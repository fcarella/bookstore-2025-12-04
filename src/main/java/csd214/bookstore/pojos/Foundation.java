package csd214.bookstore.pojos;
import java.util.Objects;
import java.util.Scanner;

public class Foundation extends MakeupProduct{
    private String coverage;
    private int count;

    public Foundation(String shade, String coverage) {
        super(shade);
        this.coverage = coverage;

    }

    public Foundation(String shade, String coverage, int count) {
        super(shade);
        this.coverage = coverage;
        this.count = count;
    }

    public Foundation() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);
        System.out.println("Select coverage");
        this.coverage = getInput(input,"Full coverage");
    }
    @Override
    public void edit(Scanner input) {
        super.edit(input);
        System.out.print("Edit coverage [" +  this.coverage + "]:");
        this.coverage = getInput(input,this.coverage);
    }
    @Override
    public void sellItem() {
        System.out.println("Selling Foundation: " + getShade() + " with " + coverage + " for " + getPrice());
        setCount(getCount() - 1);
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    @Override
    public double getPrice() {
        return 40;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Foundation that = (Foundation) o;
        return Objects.equals(coverage, that.coverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coverage);
    }
}
