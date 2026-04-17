package iuh.fit.se.creationalpatterns.factorymethod;

import iuh.fit.se.creationalpatterns.simplefactory.Transport;
import iuh.fit.se.creationalpatterns.simplefactory.Truck;

//Concrete Creator
public class RoadLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
