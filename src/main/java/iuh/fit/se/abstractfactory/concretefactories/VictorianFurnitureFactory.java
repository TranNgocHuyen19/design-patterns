package iuh.fit.se.abstractfactory.concretefactories;

import iuh.fit.se.abstractfactory.abstractfactory.FurnitureFactory;
import iuh.fit.se.abstractfactory.abstractproducts.Chair;
import iuh.fit.se.abstractfactory.abstractproducts.CoffeeTable;
import iuh.fit.se.abstractfactory.abstractproducts.Sofa;
import iuh.fit.se.abstractfactory.concreteproducts.victorian.VictorianChair;
import iuh.fit.se.abstractfactory.concreteproducts.victorian.VictorianCoffeeTable;
import iuh.fit.se.abstractfactory.concreteproducts.victorian.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
