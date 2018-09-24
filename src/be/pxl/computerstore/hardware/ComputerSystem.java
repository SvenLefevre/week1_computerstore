package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;

public class ComputerSystem implements Computable {
    public static final int MAX_PERIPHERAL = 3;
    private ComputerCase computerCase;
    private Processor processor;
    private HardDisk hardDisk;
    private Peripheral[];

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {

    }

    private int getNextPeripheralIndex(){
        for(int i=0; i){

        }
    }





}
