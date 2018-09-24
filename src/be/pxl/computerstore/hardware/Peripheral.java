package be.pxl.computerstore.hardware;

public abstract class Peripheral extends ComputerComponent {

    public Peripheral(String vendor, String name, double price){
        super(vendor, name, price);
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " " + super.toString();
    }

    @Override
    public String getFullDescription(){
        return "help";
    }
}
