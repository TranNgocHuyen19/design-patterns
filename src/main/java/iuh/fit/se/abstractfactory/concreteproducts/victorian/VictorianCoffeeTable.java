package iuh.fit.se.abstractfactory.concreteproducts.victorian;

import iuh.fit.se.abstractfactory.abstractproducts.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("VictorianCoffeeTable putCoffee");
    }

    @Override
    public String getSize() {
        return "VictorianCoffeeTable size";
    }
}
