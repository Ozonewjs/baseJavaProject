package utils.designmode.builderpattern.example.buildmeal;

import utils.designmode.builderpattern.example.buildmeal.Bottle;
import utils.designmode.builderpattern.example.ibulidmeal.Item;
import utils.designmode.builderpattern.example.ibulidmeal.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
