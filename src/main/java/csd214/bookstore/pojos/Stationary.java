package csd214.bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public abstract class Stationary extends Product {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Stationary() {
    }

    @Override
    public String toString() {
        return "Stationary{" +
                "brand='" + brand + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Stationary that)) return false;
        return Objects.equals(getBrand(), that.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBrand());
    }

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);
        System.out.println("Enter Brand:");
       this.brand = getInput(input,"Generic");
    }
    @Override
    public void edit(Scanner input) {
        System.out.println("Edit Author [" + this.brand + "]:");
        this.brand = getInput(input, this.brand);
    }

}

