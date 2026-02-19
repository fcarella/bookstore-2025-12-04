package csd214.pojos;

import java.util.Objects;
import java.util.Scanner;

public abstract class VideoGame extends Product{
    private String platform;

    public String getPlatform(){return platform;}

    public void setPlatform(String platform){this.platform = platform;}

    public VideoGame(String name, String platform, double price, int copies){
        this.platform = platform;
    }
    @Override
    public void sellItem(){
    }

    @Override
    public String toString(){
        return "Video Game{" +
                "platform'" + platform +'\''+
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VideoGame videoGame)) return false;
        return Objects.equals(getPlatform(), videoGame.getPlatform());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPlatform());
    }

    @Override
    public void initialize(Scanner input){
        super.initialize(input);

       // Scanner platform = new Scanner(System.in);
        System.out.println("Enter the Platform: ");
        platform = input.nextLine();
    }

    @Override
    public void edit(Scanner input){
        System.out.println("Edit " + this.platform + ": ");
        this.platform = getInput(input, this.platform);
    }


}
