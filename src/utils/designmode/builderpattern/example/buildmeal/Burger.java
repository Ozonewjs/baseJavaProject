package utils.designmode.builderpattern.example.buildmeal;

import utils.designmode.builderpattern.example.ibulidmeal.Item;
import utils.designmode.builderpattern.example.ibulidmeal.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
