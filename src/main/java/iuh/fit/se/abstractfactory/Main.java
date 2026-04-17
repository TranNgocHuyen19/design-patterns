package iuh.fit.se.abstractfactory;

import iuh.fit.se.abstractfactory.abstractfactory.FurnitureFactory;
import iuh.fit.se.abstractfactory.client.InteriorDesigner;
import iuh.fit.se.abstractfactory.concretefactories.ModernFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        InteriorDesigner room = new InteriorDesigner(factory);
        room.decorate();
    }
}
