package iuh.fit.se.abstractfactory.concretefactories;

import iuh.fit.se.abstractfactory.abstractfactory.FurnitureFactory;
import iuh.fit.se.abstractfactory.abstractproducts.Chair;
import iuh.fit.se.abstractfactory.abstractproducts.CoffeeTable;
import iuh.fit.se.abstractfactory.abstractproducts.Sofa;
import iuh.fit.se.abstractfactory.concreteproducts.modern.ModernChair;
import iuh.fit.se.abstractfactory.concreteproducts.modern.ModernCoffeeTable;
import iuh.fit.se.abstractfactory.concreteproducts.modern.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
