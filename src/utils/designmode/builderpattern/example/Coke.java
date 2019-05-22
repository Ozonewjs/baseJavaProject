package utils.designmode.builderpattern.example;

import utils.designmode.builderpattern.example.buildmeal.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
