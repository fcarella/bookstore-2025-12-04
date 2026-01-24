package csd214.bookstore.pojos;

public class ActionGame extends VideoGame{
    private boolean isMultiplayer;

    @Override
    public void initialize(){
        super.initialize();
        isMultiplayer = true;
    }

    @Override
    public void sellItem() {
        System.out.println("Selling Action Game for " + Platform + " | Multiplayer: " + isMultiplayer);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
