package csd214.bookstore.pojos;

public class Drum extends MusicalInstrument {

    private String drumType;

    public Drum() {
        super();
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Drum Type:");
        this.drumType = getInput("Snare");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Edit Drum Type:");
        this.drumType = getInput(this.drumType);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + drumType + " Drum...");
    }
}
