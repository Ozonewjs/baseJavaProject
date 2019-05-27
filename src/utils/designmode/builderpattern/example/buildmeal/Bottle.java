package utils.designmode.builderpattern.example.buildmeal;

import utils.designmode.builderpattern.example.ibulidmeal.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
