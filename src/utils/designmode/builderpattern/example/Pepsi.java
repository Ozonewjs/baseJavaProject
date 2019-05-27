package utils.designmode.builderpattern.example;

import utils.designmode.builderpattern.example.buildmeal.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
