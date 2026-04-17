package iuh.fit.se.creationalpatterns.abstractfactory.concretefactories;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractfactory.FurnitureFactory;
import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Chair;
import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.CoffeeTable;
import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Sofa;
import iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.modern.ModernChair;
import iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.modern.ModernCoffeeTable;
import iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.modern.ModernSofa;

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
