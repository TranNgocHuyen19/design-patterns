package iuh.fit.se.creationalpatterns.factorymethod;

import iuh.fit.se.creationalpatterns.simplefactory.Ship;
import iuh.fit.se.creationalpatterns.simplefactory.Transport;

//Concrete Creator
public class SeaLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
