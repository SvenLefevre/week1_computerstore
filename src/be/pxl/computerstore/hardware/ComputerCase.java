package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent  {

    private String vendor;
    private String name;
    private double price;
    private Dimension dimension;
    private int weight;

    public ComputerCase(String vendor, String name, int price){
        this.vendor = vendor;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getFullDescription(){
        StringBuilder description = new StringBuilder(super.getFullDesription());
        description.append(dimension);
        description.append("Weight = ");
    }
}
