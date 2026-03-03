package csd214.bookstore.pojos;

import java.util.Objects;

public class Football extends SportsEquipment {

    private int size;

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Football Size (3, 4, 5):");
        String input = getInput("5");
        try {
            this.size = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            this.size = 5;
        }
    }

    // PART D: Business Logic Fix
    @Override
    public void sellItem() {
        System.out.println("Selling " + getName() + " size " + size);
        this.setCopies(this.getCopies() - 1);
    }

    // PART B: Identity Fix
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Football football = (Football) o;
        return size == football.size &&
                Double.compare(football.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), football.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), size);
    }

    @Override
    public String toString() {
        return "Football: " + getName() + " (Size: " + size + ", Price: $" + getPrice() + ")";
    }
}