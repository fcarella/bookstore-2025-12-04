package csd214.bookstore.pojos;

public class Pen extends Stationery{
    private String color;

    @Override
    public void initialize(){
        super.initialize();
        System.out.println("Enter Color");
        this.color= getInput("Unknown color");
    }
    @Override
    public void sellItem() {
        System.out.println("Selling" + color + "Pen");
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
