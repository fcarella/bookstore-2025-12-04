package csd214.bookstore.pojos;

public class Guitar extends MusicalInstrument {

    private int numberOfStrings;

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Number of Strings:");
        this.numberOfStrings = Integer.parseInt(getInput("6"));
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Edit Number of Strings:");
        this.numberOfStrings =
                Integer.parseInt(getInput(String.valueOf(numberOfStrings)));
    }

    @Override
    public void sellItem() {
        System.out.println(
                "Selling Guitar with " + numberOfStrings + " strings..."
        );
    }
}
