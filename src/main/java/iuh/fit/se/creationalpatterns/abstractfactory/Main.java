package iuh.fit.se.creationalpatterns.abstractfactory;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractfactory.FurnitureFactory;
import iuh.fit.se.creationalpatterns.abstractfactory.client.InteriorDesigner;
import iuh.fit.se.creationalpatterns.abstractfactory.concretefactories.ModernFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        InteriorDesigner room = new InteriorDesigner(factory);
        room.decorate();
    }
}
