package iuh.fit.se.creationalpatterns.abstractfactory.concretefactories;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractfactory.FurnitureFactory;
import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Chair;
import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.CoffeeTable;
import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Sofa;
import iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.victorian.VictorianChair;
import iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.victorian.VictorianCoffeeTable;
import iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.victorian.VictorianSofa;

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
