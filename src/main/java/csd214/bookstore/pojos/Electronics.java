package csd214.bookstore.pojos;

public abstract class Electronics extends Product {
    private int warrantyMonths;  // Example

    public int getWarrantyMonths() { return warrantyMonths; }
    public void setWarrantyMonths(int warrantyMonths) { this.warrantyMonths = warrantyMonths; }

    @Override
    public void initialize() {
        System.out.println("Enter Warranty (months):");
        this.warrantyMonths = getInput(12);
    }

    @Override
    public void edit() {
        System.out.println("Edit Warranty (months):");
        this.warrantyMonths = getInput(this.warrantyMonths);
    }

    @Override
    public double getPrice() {
        return 0.0; //price logic
    }
}