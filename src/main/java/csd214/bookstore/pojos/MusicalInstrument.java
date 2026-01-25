package csd214.bookstore.pojos;

public abstract class MusicalInstrument extends Product {

    private String material;

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Material:");
        this.material = getInput("Wood");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Edit Material:");
        this.material = getInput(this.material);
    }

    @Override
    public double getPrice() {
        return getPrice();
    }
}
