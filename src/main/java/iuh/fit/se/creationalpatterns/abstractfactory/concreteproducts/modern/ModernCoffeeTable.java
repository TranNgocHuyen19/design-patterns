package iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.modern;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("ModernCoffeeTable putCoffee");
    }

    @Override
    public String getSize() {
        return "ModernCoffeeTable size";
    }
}
