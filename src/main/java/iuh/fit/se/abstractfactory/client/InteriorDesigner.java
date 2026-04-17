package iuh.fit.se.abstractfactory.client;

import iuh.fit.se.abstractfactory.abstractfactory.FurnitureFactory;
import iuh.fit.se.abstractfactory.abstractproducts.Chair;
import iuh.fit.se.abstractfactory.abstractproducts.CoffeeTable;
import iuh.fit.se.abstractfactory.abstractproducts.Sofa;

public class InteriorDesigner {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public InteriorDesigner(FurnitureFactory factory){
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.coffeeTable = factory.createCoffeeTable();
    }

    public void decorate() {
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putCoffee();
    }
}
