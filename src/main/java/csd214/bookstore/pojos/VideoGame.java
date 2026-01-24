package csd214.bookstore.pojos;

public abstract class VideoGame extends Product{
    protected String Platform;

    @Override
    public void initialize(){
        super.initialize();
    }

    @Override
    public void edit(){
        System.out.println("Edit " + this.Platform + ": ");
        this.Platform = getInput(this.Platform);
    }
}
