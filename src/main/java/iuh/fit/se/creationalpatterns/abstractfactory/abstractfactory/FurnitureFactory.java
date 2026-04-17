package iuh.fit.se.creationalpatterns.abstractfactory.abstractfactory;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Chair;
import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.CoffeeTable;
import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
