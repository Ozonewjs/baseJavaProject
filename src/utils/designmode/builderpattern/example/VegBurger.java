package utils.designmode.builderpattern.example;

import utils.designmode.builderpattern.example.buildmeal.Burger;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
