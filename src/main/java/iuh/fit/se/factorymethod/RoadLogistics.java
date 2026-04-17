package iuh.fit.se.factorymethod;

import iuh.fit.se.simplefactory.Transport;
import iuh.fit.se.simplefactory.Truck;

//Concrete Creator
public class RoadLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
