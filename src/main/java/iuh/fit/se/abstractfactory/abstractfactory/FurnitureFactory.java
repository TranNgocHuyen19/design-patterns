package iuh.fit.se.abstractfactory.abstractfactory;

import iuh.fit.se.abstractfactory.abstractproducts.Chair;
import iuh.fit.se.abstractfactory.abstractproducts.CoffeeTable;
import iuh.fit.se.abstractfactory.abstractproducts.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
