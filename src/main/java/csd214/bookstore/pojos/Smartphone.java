package csd214.bookstore.pojos;

public class Smartphone extends Electronics {
    private int cameraMP;  // Unique field

    public int getCameraMP() { return cameraMP; }
    public void setCameraMP(int cameraMP) { this.cameraMP = cameraMP; }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Camera Megapixels:");
        this.cameraMP = getInput(12);
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Edit Camera Megapixels:");
        this.cameraMP = getInput(this.cameraMP);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling Smartphone with " + cameraMP + "MP camera...");
    }
}