package iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.victorian;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.CoffeeTable;

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
