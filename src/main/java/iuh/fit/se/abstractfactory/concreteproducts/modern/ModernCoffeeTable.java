package iuh.fit.se.abstractfactory.concreteproducts.modern;

import iuh.fit.se.abstractfactory.abstractproducts.CoffeeTable;

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
