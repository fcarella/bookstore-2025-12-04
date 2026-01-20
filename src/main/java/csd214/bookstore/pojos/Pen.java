package csd214.bookstore.pojos;

public class Pen extends Stationery{
    private String color;
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void initialize(){
        super.initialize();
        System.out.println("Enter Color");
        setColor(getInput(""));
    }
    @Override
    public void sellItem() {
        System.out.println("Selling [Color] Pen");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
