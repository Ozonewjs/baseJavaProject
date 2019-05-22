package utils.designmode.builderpattern.example;

import utils.designmode.builderpattern.example.buildmeal.Burger;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
