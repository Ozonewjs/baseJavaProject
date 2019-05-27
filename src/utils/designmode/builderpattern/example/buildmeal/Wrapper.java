package utils.designmode.builderpattern.example.buildmeal;

import utils.designmode.builderpattern.example.ibulidmeal.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
