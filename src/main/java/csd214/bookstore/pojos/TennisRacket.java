package csd214.bookstore.pojos;

import java.util.Objects;

public class TennisRacket extends SportsEquipment {

    private int stringTension;

    public int getStringTension() {
        return stringTension;
    }

    public void setStringTension(int stringTension) {
        this.stringTension = stringTension;
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter String Tension:");
        String input = getInput("");
        try {
            this.stringTension = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            this.stringTension = 55; // Default tension
        }
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Current String Tension: " + stringTension);
        System.out.println("Enter new tension (press Enter to keep current):");
        String newValue = getInput("");
        if (!newValue.isEmpty()) {
            try {
                this.stringTension = Integer.parseInt(newValue);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Keeping current.");
            }
        }
    }

    // --- PART D: Business Logic (Stock Reduction) ---
    @Override
    public void sellItem() {
        System.out.println("Selling Tennis Racket with tension " + stringTension);
        this.setCopies(this.getCopies() - 1);
    }

    // --- PART B: Identity (Equality) ---
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TennisRacket that = (TennisRacket) o;
        return stringTension == that.stringTension &&
                Double.compare(that.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), stringTension);
    }

    @Override
    public String toString() {
        return "Tennis Racket: " + getName() + " (" + getSportType() + ", Tension: " + stringTension + ", Price: $" + getPrice() + ")";
    }
}